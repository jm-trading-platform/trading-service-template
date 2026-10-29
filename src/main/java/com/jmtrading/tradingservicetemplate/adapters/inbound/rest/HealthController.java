package com.jmtrading.tradingservicetemplate.adapters.inbound.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sample")
public class HealthController {

    @GetMapping
    public String sample() {

        return "SERVICE UP";
    }

}