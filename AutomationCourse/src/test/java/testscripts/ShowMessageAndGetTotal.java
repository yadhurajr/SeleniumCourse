package testscripts;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShowMessageAndGetTotal extends Base {
	
	public void showMessage() {

		String input = "Hello";
		
		WebElement singleInputTestField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTestField.sendKeys(input);
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton)); //explicit wait
		showMessageButton.click();
		
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String messageText = yourMessageText.getText();
		
		
		if(messageText.contains(input)) {
			System.out.println("Test Case 1 Passed");
	    }
	    else {
	    	System.out.println("Test Case 1 Failed");
	    }
		
		
		String classNameOfShowMessageButton = showMessageButton.getAttribute("class");
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();

	}
	
	public void getTotal() {
		
		String valueA = "12";
		WebElement enterValueATextField = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueATextField.sendKeys(valueA);
		
		String valueB = "28";
		WebElement enterValueBTextField = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueBTextField.sendKeys(valueB);
		
		//Converting the string valueA and valueB into an integer and adding.
		int expectedSumOfAandB = Integer.parseInt(valueA) + Integer.parseInt(valueB);
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));
		getTotalButton.click();
		
		WebElement totalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalValue = totalText.getText().substring(14);
		
	    //int totalTextValue = Integer.parseInt(totalValue.split(":")[1].trim());
		int totalTextValue = Integer.parseInt(totalValue);
		
		if(totalTextValue == expectedSumOfAandB) {
			System.out.println("Test Case 2 Passed");
		}
		else {
			System.out.println("Test Case 2 Failed");
		}
		
	}

	public static void main(String[] args) {
		ShowMessageAndGetTotal showmessageandgettotal = new ShowMessageAndGetTotal();
		showmessageandgettotal.initializeBrowser();
		showmessageandgettotal.showMessage();
		showmessageandgettotal.getTotal();
		showmessageandgettotal.driverQuit();

	}

}
