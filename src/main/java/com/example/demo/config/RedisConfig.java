package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@PropertySource("classpath:application.properties")
@Configuration
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;
   /* @Value("{ spring.redis.jedis.pool.min-idle}")
   private int minIdle;*/
   @Value("${spring.redis.jedis.pool.max-wait}")
   private int maxWait;

    @Bean
    public JedisPool redisPoolFactory()  throws Exception{
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWait);
     //  jedisPoolConfig.setMinIdle(minIdle);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port);
        return jedisPool;
    }
}
