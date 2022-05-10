package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import Pom_Adactin.Book_Hotel;
import Pom_Adactin.Login_Page;
import Pom_Adactin.Search_Hotel;
import Pom_Adactin.User_Page;

public class Pom_class {
	
	public static WebDriver driver;
	
	private Login_Page lp;
	
	private Book_Hotel bh;
	
	private Search_Hotel sh;
	
	private User_Page up;

	public Pom_class(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}


	public Login_Page getLp() {
		
		lp = new Login_Page(driver);
		return lp;
	}
	


	public Book_Hotel getBh() {
		
		bh = new Book_Hotel(driver);
		return bh;
	}

	public Search_Hotel getSh() {
		
		sh = new Search_Hotel(driver);
		return sh;
	}

	public User_Page getUp() {
		
		up = new User_Page(driver);
		return up;
	}




 



}
