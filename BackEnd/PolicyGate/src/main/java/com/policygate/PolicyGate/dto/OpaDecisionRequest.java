package com.policygate.PolicyGate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpaDecisionRequest {

    private Input input;

    public OpaDecisionRequest(String role, String action, String environment) {
        this.input = new Input(role, action, environment);
    }
    // Nested static class representing the actual policy input
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Input {
        private String role;
        private String action;
        private String environment;
    }
}
