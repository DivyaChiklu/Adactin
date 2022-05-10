package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber.Baseclass;
import com.adactin.properties.Configuration_Reader;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Runner_Class;
import com.sdp.Pom_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Baseclass{
	
	public static WebDriver driver = Runner_Class.driver;
	public static Pom_class pom = new Pom_class(driver);
	
	
	@Given("^user launch The Application$")
	public void user_launch_The_Application() throws Throwable {
		
		File_Reader_Manager.getInstance().getInstanceCR();
		String url = Configuration_Reader.getUrl();
		getUrl(url);
 
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	  inputValueElement(pom.getLp().getUsername(), "divyachiklu");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputValueElement(pom.getLp().getPassword(), "Chiklu@0401");
	    
	}

	@Then("^Click The Login Button And It Navigates To Search Hotel Page$")
	public void click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	     clickOnElement(pom.getLp().getLogin());
	} 

	@When("^user Select Location$")
	public void user_Select_Location() throws Throwable {
		dropDown(pom.getSh().getLocation(), "ByIndex", "2");
	}

	@When("^user Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		dropDown(pom.getSh().getHotels(), "ByVisibleText", "Hotel Sunshine");
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		dropDown(pom.getSh().getRoom_type(), "Byindex", "1"); 
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		dropDown(pom.getSh().getRoom_nos(), "Byindex", "2"); 
	}

	@When("^user Enter The CheckIn Date$")
	public void user_Enter_The_CheckIn_Date() throws Throwable {
		inputValueElement(pom.getSh().getDatepick_in(), "30/04/2022");  
	}

	@When("^user Enter The CheckOut Date$")
	public void user_Enter_The_CheckOut_Date() throws Throwable {
		inputValueElement(pom.getSh().getDatepick_out(), "03/05/2022"); 
	}

	@When("^user Select Adult Per Room$")
	public void user_Select_Adult_Per_Room() throws Throwable {
		dropDown(pom.getSh().getAdult_room(), "ByVisibleText", "3 - Three");
	}

	

	@Then("^Click Search Button to Select Hotel Page$")
	public void click_Search_Button_to_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getSh().getSubmit()); 
	}

	@When("^user click The Radio Button$")
	public void user_click_The_Radio_Button() throws Throwable {
		clickOnElement(pom.getUp().getRadio_button());
	}

	@Then("^Click Search Button to Book the Hotel$")
	public void click_Search_Button_to_Book_the_Hotel() throws Throwable {
		clickOnElement(pom.getUp().getContine()); 
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		inputValueElement(pom.getBh().getFirst_name(), "Divya");
	}

	@When("^user Enter The Last name$")
	public void user_Enter_The_Last_name() throws Throwable {
		inputValueElement(pom.getBh().getLast_name(), "bharathi"); 
	}

	@When("^user Enter the Address$")
	public void user_Enter_the_Address() throws Throwable {
		inputValueElement(pom.getBh().getAddress(), "Madurai");
	}

	@When("^user Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {
		inputValueElement(pom.getBh().getCreditcard(), "12345678900987654"); 
	}

	@When("^user Select Card Type$")
	public void user_Select_Card_Type() throws Throwable {
		dropDown(pom.getBh().getCardtype(), "ByIndex", "2");   
	}

	@When("^user Select Card Expiry Month And Year$")
	public void user_Select_Card_Expiry_Month_And_Year() throws Throwable {
		dropDown(pom.getBh().getExp_month(), "Byvalue", "3");
		dropDown(pom.getBh().getExp_year(), "ByIndex", "4");
	}

	@When("^user Enter CVV Pin$")
	public void user_Enter_CVV_Pin() throws Throwable {
		inputValueElement(pom.getBh().getCvv(), "1111");
	}

	@Then("^Click The Book Now Button$")
	public void click_The_Book_Now_Button() throws Throwable {
		clickOnElement(pom.getBh().getBook());
	}

	

}
