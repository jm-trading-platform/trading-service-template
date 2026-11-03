package com.jmtrading.tradingservicetemplate.shared.event;

public record HealthEvent(
        String id,
        String timestamp,
        String status
) {
}
