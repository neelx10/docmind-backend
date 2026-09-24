package com.substring.agent.backend.dto;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor  
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private LocalDateTime timeStamp;
}
