package com.util.cache;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import com.dao.impl.RedisDaoImpl;

import redis.clients.jedis.JedisPool;

public class CacheUtils {
	private static CacheUtils instance;
	
	private RedisDaoImpl cache;
	
	public CacheUtils(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring/spring-redis.xml");
		cache = new RedisDaoImpl();
		JedisPool pool = (JedisPool) ap.getBean("jedisPool");
		cache.setJedisPool(pool);
	}
	
	public static CacheUtils getInstance(){
		if(instance == null){
			synchronized (CacheUtils.class) {
				if(instance == null){
					instance = new CacheUtils();
				}
			}
		}
		return instance;
	}
	
	public RedisDaoImpl getCache(){
		return cache;
	}
	
}
