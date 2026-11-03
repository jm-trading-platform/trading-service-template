package com.jmtrading.tradingservicetemplate.application.usecases;

import com.jmtrading.tradingservicetemplate.application.port.outbound.EventPublisherPort;
import com.jmtrading.tradingservicetemplate.shared.event.HealthEvent;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class EventUseCase {

    private final EventPublisherPort publisher;

    public EventUseCase(
            EventPublisherPort publisher) {

        this.publisher = publisher;
    }

    public void publish() {

        HealthEvent event = new HealthEvent(
                UUID.randomUUID().toString(),
                Instant.now().toString(),
                "UP"
        );

        publisher.publish("health-topic", event);
    }
}