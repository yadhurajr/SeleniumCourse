package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertSample extends Base {
	
	@Test
	public void softAssertSample() {
		String input = "Hello";
		
		SoftAssert softassert = new SoftAssert();
		
		
		WebElement singleInputTestField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTestField.sendKeys(input);
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String messageText = yourMessageText.getText();
		messageText = messageText.substring(15);
		softassert.assertEquals(input, messageText, "Your message is not " + input);
		
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		softassert.assertTrue(isShowMessageButtonDisplayed, "Show Message button is not displayed");
		softassert.assertAll();
	}

}
