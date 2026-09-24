package com.substring.agent.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ProjectConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DocMind - AI Document Assistant & RAG Backend")
                        .description("DocMind RESTAPI documentation")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("NEELX")
                                .email("neelotpal10@gmail.com")
                                .url("")));
    }
}