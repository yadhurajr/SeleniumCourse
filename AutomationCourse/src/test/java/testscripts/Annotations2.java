package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByIndex(3);
	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.quit();
	}
		
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
		
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
