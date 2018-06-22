package com.dao;

public interface IRedisDao {
	String get(String key);
	
	String set(String key, String value);
	
	String hget(String hkey, String key);
	
	Long hset(String hkey, String key, String value);
}
