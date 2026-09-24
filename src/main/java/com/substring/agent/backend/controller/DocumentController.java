package com.substring.agent.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/documents")
@Tag (name = "Document Controller", description = "Endpoint for document upload and management and their vector embeddings.")
public class DocumentController {
    @PostMapping
    @Operation (summary = "Upload and Index a Document(PDF, DOCX, TXT, MD, CSV)", description = "This api is used to upload and index documents files.")
    public ResponseEntity<String> uploadDocument() {
        // Handle document upload logic here
        return ResponseEntity.ok("Document uploaded successfully");
    }
}
