package com.service;


import com.alibaba.fastjson.JSONObject;

public interface TestService {
	JSONObject getAll(JSONObject inputJson, JSONObject outputJson) throws Exception;
	JSONObject addOne(JSONObject inputJson, JSONObject outputJson) throws Exception;
}
