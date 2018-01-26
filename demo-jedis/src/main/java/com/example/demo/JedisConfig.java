package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by jerry on 2018/1/19.
 *
 * @author jerry
 */
@Configuration
public class JedisConfig {

    /**
     * @param maxTotal
     * @param maxIdle
     * @param minIdle
     * @param maxWaitMillis
     * @return
     */
    @Bean("jedis.config")
    public JedisPoolConfig jedisPoolConfig(@Value("${jedis.pool.max-total}") int maxTotal,
                                           @Value("${jedis.pool.max-idle}") int maxIdle,
                                           @Value("${jedis.pool.min-idle}") int minIdle,
                                           @Value("${jedis.pool.max-wait-millis}") int maxWaitMillis,
                                           @Value("${jedis.pool.block-when-exhausted}") boolean blockWhenExhausted) {

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        config.setMaxWaitMillis(maxWaitMillis);


        // connection 用完是否 block, true 會 block 到 timeout, false 回報 exception
        config.setBlockWhenExhausted(blockWhenExhausted);
        return config;
    }


    @Bean
    public JedisPool jedisPool(JedisPoolConfig jedisPoolConfig,
                               @Value("${jedis.host}") String host,
                               @Value("${jedis.port}") int port,
                               @Value("${jedis.password}") String password,
                               @Value("${jedis.connection-timeout}") int timeout) {

        return new JedisPool(jedisPoolConfig, host, port, timeout, password);
//        return new JedisPool(jedisPoolConfig, host, port, timeout);
    }
}
