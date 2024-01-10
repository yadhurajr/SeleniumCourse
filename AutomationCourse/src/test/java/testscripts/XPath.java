package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base {
	
	public void xpathLocators() {
		WebElement xpathElement1 = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement xpathElement6 = driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement xpathElement7 = driver.findElement(By.xpath("//button[@id='button-one']//parent::form")); //locating parent or identifying parent
		WebElement xpathElement8 = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form"));
		WebElement xpathElement9 = driver.findElement(By.xpath("//div[@class='header-top']//child::div[@class='container']"));
	}

	public static void main(String[] args) {
		XPath xpath = new XPath();
		xpath.initializeBrowser();
		xpath.xpathLocators();
		xpath.driverQuit();

	}

}
