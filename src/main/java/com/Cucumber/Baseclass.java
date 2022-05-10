package com.Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	

		private static String value;
		
		public static WebDriver driver;
		
		public static WebDriver getBrowser(String type) {
			
			if (type.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Binary\\Desktop\\Cucumber\\chromeee\\chromedriver_win32 (1)\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			return driver;
		}
		
		public static void clickOnElement(WebElement element) {
			
			element.click();
		}
		
		public static void inputValueElement(WebElement element, String value) {
			
			element.sendKeys(value);
		}
		
		public static WebDriver close() {
			
			driver.close();
			
			return driver;
		}
		
		public static void quit() {
			
			driver.quit();
		}
		
		public static void getUrl(String url) {
			
			driver.get(url);
		}
		
		public static void navigate(String url1) {
			
			driver.navigate().to("url1");
			
			}
		public static void naviback() {
			
			driver.navigate().back();
		}
		
		public static void naviforward() {
			
			driver.navigate().forward();
		}
		
		public static void refresh() {
			driver.navigate().refresh();
		}
		
		public static void simplealert1(WebElement element) {
			
			element.click();
			
			driver.switchTo().alert().accept();
		}
		
		public static void confirmalert(String type) {
			
			if(type.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			}
			else if (type.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		}
		
		public static void rightclick() {
			Actions a = new Actions(driver);
			a.contextClick().build().perform();
		}
		
		public static void rightclickT(WebElement ele) {
			Actions a = new Actions(driver);
			a.contextClick(ele).build().perform();
		}
		
		public static void draganddrop(WebElement source, WebElement target ) {
			Actions a = new Actions(driver);
			a.dragAndDrop(source, target).perform();
		}
		
		public static void clickandhold() {
			Actions a = new Actions(driver);
			a.clickAndHold().perform();
			}
		
		public static void clickandholdT(WebElement ele) {
			Actions a = new Actions(driver);
			a.clickAndHold(ele).perform();
		}
		
		public static void doubleclick(WebElement ele) {
			Actions a = new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
		public static void moveToElement(WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
		public static void release(WebElement ele) {
			Actions a = new Actions(driver);
			a.release(ele).perform();
			
		}
		
		public static void outerframe(WebElement ele) {
			
			driver.switchTo().frame(ele);
		}
		
		public static void defaultcontext() {
			
			driver.switchTo().defaultContent();
		}
		
		public static void frameindex(int index) {
			driver.switchTo().frame(index);
		}
		
		public static void robodown(WebElement element) throws AWTException {
			
	         Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		public static void roboenter(WebElement element) throws AWTException {
			
	        Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void windowhandles() {
			
	Set<String> windowHandles = driver.getWindowHandles();
			
			for (String s1 : windowHandles) {
				
				System.out.println(driver.switchTo().window(s1).getTitle());
			}
			
		}
			
		public static void windowhandles1(String s) {
			
			Set<String> windowHandles = driver.getWindowHandles();
	        for (String s2 : windowHandles) {
	        	
	        	if (driver.switchTo().window(s2).getTitle().equalsIgnoreCase(s)) {
	        	
	        	break;
	        	
	        	}
	        	
	        }
		}
		
		public static void ismultiple(WebElement element){
			
	       Select s = new Select (element);
			
			boolean multiple = s.isMultiple();
			
			System.out.println(multiple);
		}
		
		public static void allOption(WebElement element){
			
			Select s = new Select (element);
	           List <WebElement> options = s.getOptions();
			
			for (WebElement webelement : options) {
				
				System.out.println("Get options :" + webelement.getText());
		}
	}
		
		public static void allSelectedOption(WebElement element) {
			Select s = new Select (element);
			
	    List <WebElement> allselected = s.getAllSelectedOptions();
			
			for (WebElement webelement : allselected) {
				
				System.out.println("Get all selected options :" + webelement.getText());
				
			}
		}
		
		public static void firstSelectedOption(WebElement element){
			Select s = new Select (element);
			
	    WebElement firstselected = s.getFirstSelectedOption();
			
			System.out.println(firstselected.getText());
		}
		
		public static void checkBox(WebElement element) {
			
			element.click();
		}
		
		public static void isEnable(WebElement element) {
			
			
				boolean enabled = element.isEnabled();
				System.out.println(enabled);
			
		}
		
		public static void isDisable(WebElement element) {
			
			
			boolean disable = element.isDisplayed();
			System.out.println(disable);
		
	}
	public static void isSelected(WebElement element) {
			
			
			boolean selected = element.isSelected();
			System.out.println(selected);
		
	}

	public static void radioButton(WebElement element) {
		
		element.click();
	}
		public static void getCurentUrl() {
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		
		public static void getText(WebElement element){
			
			getText(element);
		}
		
		public static void getTitle(WebElement element) {
			
			getTitle(element);
		}
		
		public static void getattribute(WebElement element, String value) {
			
			System.out.println("The attribute value of value is" +element.getAttribute(value));
		}
		
		public static void dropDown(WebElement element, String type, String value) {
			
			Select s = new Select (element);
			
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			}
			
			else if (type.equalsIgnoreCase("ByIndex")) {
				int i = Integer.parseInt(value);
				s.selectByIndex(i);
			}
			
			else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
	}
		public static void implicitWait(long num) {
			driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
		}
		
		public static void explicitWait(long num, WebElement element) {
			
			WebDriverWait wait = new WebDriverWait(driver,num);
	      
	      wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		}
		
		public static void screenShot(String error) throws IOException {
			
	TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\Binary\\Desktop\\Cucumber\\Screenshot\\error.png");
			
			FileUtils.copyFile(source, destination);
		}
		
		public static void scroll(String s) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			if (s.equalsIgnoreCase("up")) {
			
			js.executeScript("window.scrollBy(0,250)","");
		}
			else if(s.equalsIgnoreCase("down")) {
				
				js.executeScript("window.scrollBy(0,800)","");
				
			}
			
		
	}
		
		public static String read_Data(String path,int rownum,int cellnum) throws Throwable {
			
			File f = new File(path);
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet sheetAt = wb.getSheetAt(0);
			
			Row row = sheetAt.getRow(rownum);
			
			Cell cell = row.getCell(cellnum);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				 value = cell.getStringCellValue();
			}
			
			else if (cellType.equals(CellType.NUMERIC)) {
				
				double numericCellValue = cell.getNumericCellValue();
				
				int data = (int) numericCellValue;
				
				value = String.valueOf(data);
				
			}
			
			return value;
		}
		
		public static void clear() {
			
			
		}

	}
