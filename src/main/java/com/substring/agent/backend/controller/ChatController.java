package com.substring.agent.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController 
@RequestMapping("/api/v1/chat")
@Tag (name = "Chat Management", description = "All Chat related api's go here.")
public class ChatController {
    @PostMapping
    public ResponseEntity<String> chat() {
        return ResponseEntity.ok("Chat endpoint");
    }
}
