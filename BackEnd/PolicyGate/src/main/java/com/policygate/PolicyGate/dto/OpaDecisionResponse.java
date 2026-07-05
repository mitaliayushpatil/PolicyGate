package com.policygate.PolicyGate.dto;

import lombok.Setter;

@Setter
public class OpaDecisionResponse {

    private boolean result;

    public boolean isResult() {
        return result;
    }
}
