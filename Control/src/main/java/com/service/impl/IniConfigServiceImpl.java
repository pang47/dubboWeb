package com.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.model.IniConfigDTO;
import com.service.IniConfigService;

@Service
public class IniConfigServiceImpl extends BaseServiceImpl implements IniConfigService{

	private static final Logger logger = LoggerFactory.getLogger(IniConfigServiceImpl.class);
	
	@Override
	@SuppressWarnings(value={"unchecked","rawtypes"})
	public JSONObject getIniConfig(JSONObject inputJson,JSONObject outputJson) {
		Map map = inputJson.getJSONObject("params");
		logger.info("查找INI配置params:{}",map.toString());
		List<IniConfigDTO> list = getBaseDao().queryForList("ct.iniConfig.getIniConfigByTypeANDClass", map, List.class);
		JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
		logger.info("成功查找："+array.size());
		outputJson.put("list",array);
		return outputJson;
	}

}
