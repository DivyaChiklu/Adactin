package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Cucumber.Baseclass;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition", monochrome = true , strict = true
, plugin = {"html:Report/Cucumber_Html_Report","pretty","json:Report/Cumcumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html",})
public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		
		 String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = Baseclass.getBrowser(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		
		driver = Baseclass.close();
	}
	

}
