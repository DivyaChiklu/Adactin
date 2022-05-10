package Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Page {
	
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio_button;
	
	@FindBy(id = "continue")
	private WebElement contine;

	public User_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getContine() {
		return contine;
	}


}
