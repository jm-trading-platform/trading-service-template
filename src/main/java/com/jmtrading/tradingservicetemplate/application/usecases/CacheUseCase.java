package com.jmtrading.tradingservicetemplate.application.usecases;

import com.jmtrading.tradingservicetemplate.application.port.CachePort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CacheUseCase {

    private final CachePort cachePort;

    public CacheUseCase(CachePort cachePort) {
        this.cachePort = cachePort;
    }

    public String generateAndStore() {

        String value = LocalDateTime.now().toString();

        cachePort.save("health:time", value);

        return value;
    }

    public String getStored() {
        return cachePort.get("health:time");
    }
}