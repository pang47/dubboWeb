package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.ylzinfo.cms.sdk.CmsClient;


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
		
		CmsClient cmsClient = new CmsClient();
		
	}
	
	
}
