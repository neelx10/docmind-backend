package com.substring.agent.backend.controller;

import java.time.LocalDateTime;

import org.springframework.security.core.Authentication;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.substring.agent.backend.dto.ApiResponse;
import com.substring.agent.backend.dto.DocumentResponseDto;
import com.substring.agent.backend.entity.User;
import com.substring.agent.backend.service.DocumentMetadataService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/documents")
@Tag (name = "Document Controller", description = "Endpoint for document upload and management and their vector embeddings.")
@RequiredArgsConstructor 
public class DocumentController {
    private DocumentMetadataService documentService;
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Operation (summary = "Upload and Index a Document(PDF, DOCX, TXT, MD, CSV)", description = "This api is used to upload and index documents files.")
    public ResponseEntity<ApiResponse<DocumentResponseDto>> uploadDocument(
        @RequestParam("file")MultipartFile file,
        Authentication authentication
    ) {
        log.info("document uploading started:");
        User user = (User) authentication.getPrincipal();
        
        DocumentResponseDto documentResponseDto = this.documentService.uploadAndProcess(file,user);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(ApiResponse.<DocumentResponseDto>builder()
        .success(true)
        .data(documentResponseDto)
        .timeStamp(LocalDateTime.now())
        .message("Docuements uploaded and indexed successfully!")
        .build());
    }
}
