package com.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
	static Properties properties = new Properties(); 
	public static void readProperties() {
		
		try {
			InputStream inputStream = new FileInputStream(
					"C:\\Users\\prana\\eclipse-workspace\\ModularTest4\\src\\main\\java\\config.properties");
			properties.load(inputStream);
			System.out.println(properties.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
