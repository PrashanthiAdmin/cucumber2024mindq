package mindq.cucumberbddframework.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mindq.cucumberbddframework.base.Base;


public class LoginPage extends Base{
	
	
	public static By loginLink = By.linkText("Log in");
	
	public static By emailInputBox = By.name("email");
	
	public static By submitButton = By.id("submit-btn");
	
	public static By changeEmail = By.linkText("Change email");
	
	public static By password = By.xpath("//span[@data-testid='input-label']");
	
	public static By signinButton = By.xpath("//button[text()='Sign in']");
	
	public static By profileIcon = By.id("my-mdn-plus-button");
	
	public static By searchbar = By.xpath("//input[@id='hp-search-input']");
	
	public static By searchButton = By.xpath("(//button[contains(@class,'search-button')])[4]");
	
	public static void clickLoginLink() {
		try {
			driver.findElement(loginLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void enterEmailId(String data) {
		try {
			
			driver.findElement(emailInputBox).clear();
			driver.findElement(emailInputBox).sendKeys(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void clickSubmitButton() {
		try {
			driver.findElement(submitButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void clickSigninButton() {
		try {
			driver.findElement(signinButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clickChangeEmail() {
		try {
			driver.findElement(changeEmail).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clicksearchButton() {
		try {
			driver.findElement(searchButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void enterPassword(String data) {
		try {
			
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 * wait.until(ExpectedConditions.elementToBeClickable(password));
			 */
			
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value', '" + data +"')", driver.findElement(password));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean profileButtonPresence() {
	
		boolean isprofileButtonAvailable = false;
		
		try {
			isprofileButtonAvailable = driver.findElement(profileIcon).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isprofileButtonAvailable; 
	}
	
	
	public static void searchData(String arg1) {
		
		driver.findElement(searchbar).sendKeys(arg1);
	}
	
	
	
}

