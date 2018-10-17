package com.service;

import com.alibaba.fastjson.JSONObject;

public interface IniConfigService {
	JSONObject getIniConfig(JSONObject inputJson, JSONObject outputJson);
}
