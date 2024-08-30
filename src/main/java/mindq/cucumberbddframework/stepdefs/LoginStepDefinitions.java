package mindq.cucumberbddframework.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mindq.cucumberbddframework.pageobjects.LoginPage;

public class LoginStepDefinitions extends LoginPage{
	
	
	@Before
	public void launchHomePage() {
		launchApp("https://developer.mozilla.org/en-US/", "Chrome");

	}
	
	@After
	public void closeApplication() {
		driver.close();
	}
	
	
	//Hooks
	@Given("User is in login page")
	public void user_is_in_login_page() {
		
		//launchApp("https://developer.mozilla.org/en-US/", "Chrome");
		clickLoginLink();
	   
	}

	@When("User enters email id {string}")
	public void user_enters_email_id(String string) {
		
		enterEmailId(string);
	   
	}
	
	@When("User enters password {string}")
	public void user_enters_password(String string) {
		
		enterPassword(string);
	   
	}

	@When("User clicks signin button in password page")
	public void user_clicks_signin_button() {
		
		clickSigninButton();
	    
	}
	
	@When("User clicks signin button in login page")
	public void user_clicks_signin_button_in_login_page() {
		
		clickSubmitButton();
	    
	}


	@Then("User should login successfully")
	public void user_should_login_successfully() {
		
		Assert.assertTrue(profileButtonPresence());
		
		
	}
	
	@Then("User should be entered into Set your password screen")
	public void user_should_be_entered_into_set_your_password_screen() {
	    
	}

	@When("User clicks profile button")
	public void user_clicks_profile_button() {
	   
	}

	@When("User clicks signout button")
	public void user_clicks_signout_button() {
	    
	}

	@Then("User should successfully logged out from the application")
	public void user_should_successfully_logged_out_from_the_application() {
	    
	}

	
	@When("User should see email id in the password page {string}")
	public void user_should_see_email_id_in_the_password_page(String arg1) throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement emailText = null;
		try {
			emailText = driver.findElement(By.xpath("//div[text()='"+arg1+"']"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		Assert.assertEquals(emailText.isDisplayed(), true);
	    
	}

	
	
	@When("user enters {string} in the search bar")
	public void user_enters_string_in_the_search_bar(String data) {
		searchData(data);
	}
	
	@Then("user should be navigated to the search item {string}")
	public void user_should_be_navigated_to_the_search_item(String data) throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement searchText = null;
		try {
			searchText = driver.findElement(By.xpath("//span[contains(text(),'"+data+"')]"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		Assert.assertEquals(searchText.isDisplayed(), true);
	}
	
	
	@And("user clicks search button")
	public void user_clicks_search_button() {
		clicksearchButton();
	}

}
