package com.jmtrading.tradingservicetemplate.adapters.inbound.rest;

import com.jmtrading.tradingservicetemplate.application.usecases.CacheUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private final CacheUseCase cacheUseCase;

    public CacheController(CacheUseCase cacheUseCase) {
        this.cacheUseCase = cacheUseCase;
    }

    @GetMapping("/cache/save")
    public String save() {
        return cacheUseCase.generateAndStore();
    }

    @GetMapping("/cache/get")
    public String get() {
        return cacheUseCase.getStored();
    }

}