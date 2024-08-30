package mindq.cucumberbddframework.pageobjects;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mindq.cucumberbddframework.base.Base;


public class SetYourPasswordPage extends Base {

	public static By passwordInputBox = By.name("newPassword");
	public static By atleast8Characters = By.xpath("(//*[local-name()='path'])[4]");
	public static By atleast8CharactersText = By.xpath("//span[text()='At least 8 characters']");

	public static void enterPassword(String data) {
		try {
			driver.findElement(passwordInputBox).sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getColorOfPasswordLength() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.domAttributeToBe(driver.findElement(atleast8Characters), "fill", "#0060df"));
		String text = driver.findElement(atleast8Characters).getAttribute("fill");

		return text;
	}

	public static String getPasswordLengthText() {

		String text = driver.findElement(atleast8CharactersText).getText();

		return text;
	}

}
