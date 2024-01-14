package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDev {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}
	
	public void driverQuit() {
		driver.quit();
	}
	
	public void language() {
		
		String inputLanguage = "Português (Brasileiro)";
		
		WebElement english = driver.findElement(By.xpath("//a[text()='English' and @class='nav-link dropdown-toggle']"));
		english.click();
		List<WebElement> language = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
		for (WebElement languageItem : language) {
			String languageText = languageItem.getText();
			if (inputLanguage.equals(languageText)) {
				languageItem.click();
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		SeleniumDev seleniumdev = new SeleniumDev();
		seleniumdev.initializeBrowser();
		seleniumdev.language();
		seleniumdev.driverQuit();

	}

}
