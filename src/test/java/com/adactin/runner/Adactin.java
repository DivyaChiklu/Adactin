package com.adactin.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Cucumber.Baseclass;
import com.sdp.Pom_class;

import Pom_Adactin.Book_Hotel;
import Pom_Adactin.Login_Page;
import Pom_Adactin.Search_Hotel;
import Pom_Adactin.User_Page;

public class Adactin extends Baseclass {
	
	public static WebDriver driver = Baseclass.getBrowser("chrome");
	
	public static Pom_class pom = new Pom_class(driver);
	  
//	  public static Login_Page lp = new Login_Page(driver);
//	  
//	  public static Search_Hotel sh = new Search_Hotel(driver);
//	  
//	  public static User_Page up = new User_Page(driver);
//	  
//	  public static Book_Hotel bh = new Book_Hotel(driver);

	public static void main(String[] args) throws IOException {
		
		getUrl("https://adactinhotelapp.com/");
		 
		 driver.manage().window().maximize();
		
		
		inputValueElement(pom.getLp().getUsername(), "divyachiklu");
		inputValueElement(pom.getLp().getPassword(), "Chiklu@0401");
		clickOnElement(pom.getLp().getLogin());
		dropDown(pom.getSh().getLocation(), "ByIndex", "2");
		dropDown(pom.getSh().getHotels(), "ByVisibleText", "Hotel Sunshine");
		dropDown(pom.getSh().getRoom_type(), "Byindex", "1");
		dropDown(pom.getSh().getRoom_nos(), "Byindex", "2");
		inputValueElement(pom.getSh().getDatepick_in(), "30/04/2022");
		inputValueElement(pom.getSh().getDatepick_out(), "03/05/2022");
		dropDown(pom.getSh().getAdult_room(), "ByVisibleText", "3 - Three");
		clickOnElement(pom.getSh().getSubmit());
		clickOnElement(pom.getUp().getRadio_button());
		clickOnElement(pom.getUp().getContine());
		inputValueElement(pom.getBh().getFirst_name(), "Divya");
		inputValueElement(pom.getBh().getLast_name(), "bharathi");
		inputValueElement(pom.getBh().getAddress(), "Madurai");
		inputValueElement(pom.getBh().getCreditcard(), "12345678900987654");
		dropDown(pom.getBh().getCardtype(), "ByIndex", "2");
		dropDown(pom.getBh().getExp_month(), "Byvalue", "3");
		dropDown(pom.getBh().getExp_year(), "ByIndex", "4");
		inputValueElement(pom.getBh().getCvv(), "1111");
		clickOnElement(pom.getBh().getBook());
		screenShot("error1");
		
	}

}