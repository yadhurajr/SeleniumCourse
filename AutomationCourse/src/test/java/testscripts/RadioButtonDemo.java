package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonDemo extends Base {
	
	public void groupRadioButtonDemo() {
		
		String gender = "Male";
		String ageGroup = "19 to 44";
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleButton.click();
		WebElement ninteenTofourtyfourButton = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ninteenTofourtyfourButton.click();
		WebElement getResultsButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultsButton.click();
		
		WebElement messageText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String textOfGetResultsButton = messageText.getText();
		
		if(textOfGetResultsButton.contains(gender) && textOfGetResultsButton.contains(ageGroup)) {
	        System.out.println("Test Case of Group Radio Button is Passed");
	    } else {
	        System.out.println("Test Case of Group Radio Button is Failed");
	    }
	}

	public static void main(String[] args) {
		RadioButtonDemo radiobuttondemo = new RadioButtonDemo();
		radiobuttondemo.initializeBrowser();
		radiobuttondemo.groupRadioButtonDemo();
		radiobuttondemo.driverQuit();
		

	}

}
