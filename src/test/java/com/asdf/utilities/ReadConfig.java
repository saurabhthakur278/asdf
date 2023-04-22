package com.asdf.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	String path="C:\\Users\\saurabh_thakur\\eclipse-workspace\\asdf\\Configuration\\config.properties";
	
	public ReadConfig() {
		
		try {
		prop=new Properties();
		FileInputStream ip;
		
			ip = new FileInputStream(path);
			prop.load(ip);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public String getBaseUrl()
	{
		String value = prop.getProperty("baseUrl");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public String getBrowser()
	{
		String value = prop.getProperty("browser");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}
	

}
