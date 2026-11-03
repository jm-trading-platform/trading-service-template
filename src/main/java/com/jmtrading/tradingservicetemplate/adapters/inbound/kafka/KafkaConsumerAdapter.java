package com.jmtrading.tradingservicetemplate.adapters.inbound.kafka;

import com.jmtrading.tradingservicetemplate.shared.event.HealthEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerAdapter {

    @KafkaListener(
            topics = "health-topic",
            groupId = "trading-group")
    public void consume(
            HealthEvent event) {

        System.out.println("Evento recibido");
        System.out.println("Id: " + event.id());
        System.out.println("Timestamp: " + event.timestamp());
        System.out.println("Status: " + event.status());
    }
}