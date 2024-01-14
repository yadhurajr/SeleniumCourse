package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends Base {
	
public void SingleCheckBox() {
		
		String inputMenu = "Checkbox Demo";
		String expectedStringResult = "Success - Check box is checked";
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"list-group list-group-flush\"]//li"));
		for (WebElement menuItem : menu) {
			String menuText = menuItem.getText();
			if(inputMenu.equals(menuText)) {
				menuItem.click();
				break;
			}
		}
		WebElement singleCheckboxButton = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		singleCheckboxButton.click();
		boolean isSingleCheckBoxButtonSelected = singleCheckboxButton.isSelected();
		
		WebElement successMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String successMessage = successMessageText.getText();
		if(successMessage.contains(expectedStringResult)) {
			System.out.println("Test Case of Single Check Box is Passed");
	    }
	    else {
	    	System.out.println("Test Case of Single Check Box is Failed");
	    }
		
	}

	public static void main(String[] args) {
		CheckBoxDemo checkboxdemo = new CheckBoxDemo();
		checkboxdemo.initializeBrowser();
		checkboxdemo.SingleCheckBox();
		checkboxdemo.driverQuit();

	}

}
