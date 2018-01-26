package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJedisApplicationTests {

    @Inject
    private JedisPoolConfig jedisPoolConfig;
    @Inject
    private JedisPool jedisPool;

    @Inject
    private RedisService redisService;

    @Test
    public void assertJedisPoolNotNull() {
        assertNotNull(jedisPoolConfig);
        assertNotNull(jedisPool);
    }

    @Test
    public void verifyRedis() {

        redisService.set("jerry", "test");

        assertEquals("test", redisService.get("jerry"));
    }
}
