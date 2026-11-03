package com.jmtrading.tradingservicetemplate.adapters.outbound.kafka;

import com.jmtrading.tradingservicetemplate.application.port.outbound.EventPublisherPort;
import com.jmtrading.tradingservicetemplate.shared.event.HealthEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventPublisherAdapter
        implements EventPublisherPort {

    private final KafkaTemplate<String, HealthEvent> kafkaTemplate;

    public KafkaEventPublisherAdapter(
            KafkaTemplate<String, HealthEvent> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void publish(
            String topic,
            HealthEvent event) {

        kafkaTemplate.send(topic, event);
    }
}