package com.policygate.PolicyGate.controller;

import com.policygate.PolicyGate.entity.ResourceRequest;
import com.policygate.PolicyGate.service.RequestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requests")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public ResourceRequest create(@RequestBody ResourceRequest request) {
        return requestService.createRequest(request);
    }

    @PostMapping("/{id}/approve")
    public ResourceRequest approve(@PathVariable Long id, @RequestHeader("X-User-Role") String role) {
        return requestService.approveRequest(id, role);
    }
}