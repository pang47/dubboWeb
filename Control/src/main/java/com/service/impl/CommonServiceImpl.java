package com.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import com.alibaba.fastjson.JSONObject;
import com.service.CommonService;

public class CommonServiceImpl implements CommonService, BeanFactoryAware{
	private static Logger logger = Logger.getLogger(CommonServiceImpl.class);

	private BeanFactory factory;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory = beanFactory;
	}


	@Override
	public JSONObject execute(JSONObject inputJson) {
		JSONObject rtnJson = new JSONObject();
		rtnJson.put("retCode", "0");
		try{
			if(!StringUtils.isEmpty(inputJson.getString("serviceName"))&&!StringUtils.isEmpty(inputJson.getString("methodName"))){
				logger.info("service:"+inputJson.getString("serviceName")+" ,method:"+inputJson.getString("methodName"));
				Object object = factory.getBean(inputJson.getString("serviceName"));
				//一个入参，一个出参
				Method mth = object.getClass().getMethod(inputJson.getString("methodName"), JSONObject.class, JSONObject.class);
				mth.invoke(object, inputJson, rtnJson);	
			}else{
				rtnJson.put("retCode", "-1");
				rtnJson.put("message", "参数不全");
			}
		} catch (NoSuchMethodException e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getMessage());
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getMessage());
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			rtnJson.put("retCode", "-1");
			rtnJson.put("message", e.getLocalizedMessage());
			e.printStackTrace();
		}
		logger.info("retJson:" + rtnJson);
		return rtnJson;
	}

	
}
