package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base {
	
	public void xpathLocators() {
//		WebElement xpathElement = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
	}

	public static void main(String[] args) {
		XPath xpath = new XPath();
		xpath.initializeBrowser();
		xpath.xpathLocators();
		xpath.driverQuit();

	}

}
