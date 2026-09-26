package com.substring.agent.backend.dto;

import lombok.*;
import java.util.UUID;
import com.substring.agent.backend.entity.DocumentStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentResponseDto {
    private UUID id;
    private   String fileName;
    private  Long fileSize;
    private DocumentStatus status;
    private  Integer chunksCreated;
    private  String message;
    private Long userId;
}
