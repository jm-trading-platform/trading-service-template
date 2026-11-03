package com.jmtrading.tradingservicetemplate.adapters.inbound.rest;

import com.jmtrading.tradingservicetemplate.application.usecases.EventUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventUseCase useCase;

    public EventController(
            EventUseCase useCase) {

        this.useCase = useCase;
    }

    @PostMapping
    public void publish() {

        useCase.publish();
    }
}