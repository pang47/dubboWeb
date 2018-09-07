package com.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.service.TestService;

@Service
public class TestServiceImpl extends BaseServiceImpl implements TestService{
	private static Logger logger = Logger.getLogger(TestServiceImpl.class);
	@Override
	public JSONObject getAll(JSONObject inputJson,JSONObject outputJson) throws Exception{
		logger.info("成功进入");
		Map map = inputJson.getJSONObject("params");
		List list = getBaseDao().queryForList("ct.test.getAll", map, List.class);
		
		/*System.out.println(CacheUtils.getInstance().getCache().get("ct.test.getAll"));
		CacheUtils.getInstance().getCache().set("ct.test.getAll", "success");
		System.out.println(CacheUtils.getInstance().getCache().get("ct.test.getAll"));*/
		
		logger.info("成功查找："+list.size());
		outputJson.put("list",list);
		return outputJson;
	}
	
	@Override
	public JSONObject addOne(JSONObject inputJson, JSONObject outputJson) throws Exception {
		logger.info("成功进入");
		Map map = inputJson.getJSONObject("params");
		logger.info("map:"+map.toString());
		int index = getBaseDao().insert("ct.test.addSomeOne", map);
		logger.info("addSomeOne:"+ index);
		return outputJson;
	}
	
}
