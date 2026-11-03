package com.jmtrading.tradingservicetemplate.adapters.inbound.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerAdapter {

    @KafkaListener(
            topics = "health-topic",
            groupId = "trading-group")
    public void consume(
            String message) {

        System.out.println(
                "Mensaje recibido: "
                        + message);
    }
}