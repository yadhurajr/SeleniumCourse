package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StylesHw extends Base {
	
	public void bgColourShowMessageButton() {
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String bgColourOfShowMessageButton = showMessageButton.getCssValue("background-color");
		String actualBgColour = "rgba(0, 123, 255, 1)";
		if(bgColourOfShowMessageButton.equals(actualBgColour)) {
			System.out.println("Test Case 1 Passed");
		}
		else {
			System.out.println("Test Case 1 Failed");
		}
	}
	
	public void fontWeightShowMessageButton() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontWeightOfShowMessageButton = showMessageButton.getCssValue("font-weight");
		String actualFontWeight = "400";
		if(fontWeightOfShowMessageButton.equals(actualFontWeight)) {
			System.out.println("Test Case 2 Passed");
		}
		else {
			System.out.println("Test Case 2 Failed");
		}
	}
	
	public void fontColourShowMessageButton() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontColourOfShowMesasageButton = showMessageButton.getCssValue("color");
		String actualFontColour = "rgba(255, 255, 255, 1)";
		if(fontColourOfShowMesasageButton.endsWith(actualFontColour)) {
			System.out.println("Test Case 3 Passed");
		}
		else {
			System.out.println("Test Case 3 Failed");
		}
	}
	
	public void borderRadiusGetTotalButton() {
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String borderRadiusOfGetTotalButton = getTotalButton.getCssValue("border-radius");
		String actualBorderRadius = "4px";
		if(borderRadiusOfGetTotalButton.equals(actualBorderRadius)) {
			System.out.println("Test Case 4 Passed");
		}
		else {
			System.out.println("Test Case 4 Failed");
		}
	}

	public static void main(String[] args) {
		StylesHw styleshw = new StylesHw();
		styleshw.initializeBrowser();
		styleshw.bgColourShowMessageButton();
		styleshw.fontWeightShowMessageButton();
		styleshw.fontColourShowMessageButton();
		styleshw.borderRadiusGetTotalButton();
		styleshw.driverQuit();
	}

}
