package com.policygate.PolicyGate.entity;

import java.time.Instant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "resource_requests")
public class ResourceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requesterEmail;
    private String resourceType;   // e.g. "KAFKA_TOPIC", "DATABASE", "ENV_ACCESS"
    private String resourceName;
    private String targetEnvironment; // e.g. "prod", "staging"
    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    private String approverEmail;
    private Instant createdAt;
    private Instant updatedAt;

    // constructors, getters, setters
}
