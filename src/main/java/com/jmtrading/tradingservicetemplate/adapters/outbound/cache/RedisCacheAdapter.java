package com.jmtrading.tradingservicetemplate.adapters.outbound.cache;

import com.jmtrading.tradingservicetemplate.application.port.CachePort;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheAdapter implements CachePort {

    private final StringRedisTemplate redisTemplate;

    public RedisCacheAdapter(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void save(String key, String value) {

        redisTemplate.opsForValue()
                .set(key, value);
    }

    @Override
    public String get(String key) {

        return redisTemplate.opsForValue()
                .get(key);
    }
}