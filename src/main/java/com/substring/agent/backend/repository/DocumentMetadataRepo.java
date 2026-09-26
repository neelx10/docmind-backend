package com.substring.agent.backend.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.substring.agent.backend.entity.DocumentMetadata;
import com.substring.agent.backend.entity.DocumentStatus;
import com.substring.agent.backend.entity.User;

public interface DocumentMetadataRepo extends JpaRepository<DocumentMetadata, UUID>{
    List<DocumentMetadata> findByStatus(DocumentStatus status);

    List<DocumentMetadata> findAllByOrderByCreatedAtDesc();


    List<DocumentMetadata> findByUserOrderByCreatedAtDesc(User user);

    Optional<DocumentMetadata> findByIdAndUser(UUID id, User user);
}
