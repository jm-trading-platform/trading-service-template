package com.jmtrading.tradingservicetemplate.application.port;

public interface CachePort {

    void save(String key, String value);

    String get(String key);
}
