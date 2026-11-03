package com.jmtrading.tradingservicetemplate.application.port.outbound;

import com.jmtrading.tradingservicetemplate.shared.event.HealthEvent;

public interface EventPublisherPort {
    void publish(String topic, HealthEvent event);
}
