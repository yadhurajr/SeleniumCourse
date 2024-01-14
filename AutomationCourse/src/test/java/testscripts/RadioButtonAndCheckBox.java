package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonAndCheckBox extends Base{
	
	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleButton = driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]"));
		maleButton.click();
		boolean isMaleButtonSelected = maleButton.isSelected();
	}
	
	//create method for checkbox
	
	public void findElementsSample() {
		
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
	}
	
	public void selectClassSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Red");
		select.selectByValue("Yellow");
		select.selectByIndex(3);
	}
	

	public static void main(String[] args) {
		RadioButtonAndCheckBox radiobuttonandcheckbox = new RadioButtonAndCheckBox();
		radiobuttonandcheckbox.initializeBrowser();
		radiobuttonandcheckbox.radioButton();
		//radiobuttonandcheckbox.findElementsSample();
		//radiobuttonandcheckbox.selectClassSample();
		radiobuttonandcheckbox.driverQuit();

	}

}
