package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.inject.Inject;

/**
 * Created by jerry on 2018/1/25.
 *
 * @author jerry
 */
@Slf4j
@Service
public class RedisService {

    @Inject
    private JedisPool jedisPool;

    public String get(final String key) {

        try (Jedis jedis = jedisPool.getResource()) {
            jedis.auth("b05c954bb0c6b9b33bc1bd30f8ddc26c7a9c23777c5ad0b60073a389498c2137");
            final String value = jedis.get(key);
            log.info("Get Redis Key:{} , return Value: {}", key, value);
            return value;
        }
    }

    public void set(final String key, final String value) {

        try (Jedis jedis = jedisPool.getResource()) {
            jedis.auth("b05c954bb0c6b9b33bc1bd30f8ddc26c7a9c23777c5ad0b60073a389498c2137");
            jedis.set(key, value);
            log.info("Set Redis {}:{} is ok.", key, value);
        }
    }
}
