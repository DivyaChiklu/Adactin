package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p = new Properties();

	public Configuration_Reader() throws Throwable {  //constructor
		
		File f = new File ("C:\\Users\\Binary\\Desktop\\Cucumber\\src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p.load(fis); 
	}
	
	public static String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;
	}
	
	public static String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
}
