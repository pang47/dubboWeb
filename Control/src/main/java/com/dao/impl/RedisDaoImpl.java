package com.dao.impl;


import com.dao.IRedisDao;

import redis.clients.jedis.JedisPool;

public class RedisDaoImpl implements IRedisDao{

	private JedisPool jedisPool;
	
	@Override
	public String get(String key) {
		return jedisPool.getResource().get(key);
	}

	@Override
	public String set(String key, String value) {
		return jedisPool.getResource().set(key, value);
	}

	@Override
	public String hget(String hkey, String key) {
		return jedisPool.getResource().hget(hkey, key);
	}

	@Override
	public Long hset(String hkey, String key, String value) {
		return jedisPool.getResource().hset(hkey, key, value);
	}

	
	
	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	
}
