package com.policygate.PolicyGate.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.policygate.PolicyGate.entity.ResourceRequest;

public interface  ResourceRequestRepository extends JpaRepository<ResourceRequest, Long> {

}