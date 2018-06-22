package com.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.util.cache.CacheUtils;

public class Test {
	
	public static void main(String[] args) {
		String datePattern = "yyyy-MM-dd'.log'";
		System.out.println(datePattern.substring(0, datePattern.indexOf("'")));
		SimpleDateFormat tmpSdf = new SimpleDateFormat(datePattern.substring(0, datePattern.indexOf("'")));

		try {
			System.out.println(tmpSdf.parse("2018-06-04"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
