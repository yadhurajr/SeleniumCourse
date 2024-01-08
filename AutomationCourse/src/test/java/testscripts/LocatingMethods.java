package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingMethods {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
	}
	
	public void driverQuit() {
		driver.quit(); 
	}
	
	public void locators() {
		WebElement idElement1 = driver.findElement(By.id("classic-theme-styles-inline-css"));
		WebElement idElement2 = driver.findElement(By.id("global-styles-inline-css"));
		WebElement idElement3 = driver.findElement(By.id("kadence-blocks-global-variables-inline-css"));
		WebElement idElement4 = driver.findElement(By.id("kadence_blocks_css-inline-css"));
		WebElement idElement5 = driver.findElement(By.id("kadence-global-inline-css"));
		
		
		WebElement headerElement1 = driver.findElement(By.className("rank-math-schema-pro"));
		WebElement headerElement2 = driver.findElement(By.className("gtranslate_css"));
		WebElement headerElement3 = driver.findElement(By.className("site-mobile-header-wrap"));
		WebElement headerElement4 = driver.findElement(By.className("gsc-results-wrapper-overlay"));
		WebElement headerElement5 = driver.findElement(By.className("gsc-results-close-btn"));
		
		
		WebElement linkText1 = driver.findElement(By.linkText("Skip to content"));
		WebElement linkText2 = driver.findElement(By.linkText("Execute Java Online"));
		WebElement linkText3 = driver.findElement(By.linkText("Execute Javascript"));
		WebElement linkText4 = driver.findElement(By.linkText("Execute HTML"));
		WebElement linkText5 = driver.findElement(By.linkText("Execute Python"));
		
		
		WebElement partialLinkText1 = driver.findElement(By.partialLinkText("Skip"));
		WebElement partialLinkText2 = driver.findElement(By.partialLinkText("Execute"));
//		WebElement partialLinkText3 = driver.findElement(By.partialLinkText("SAP"));
//		WebElement partialLinkText4 = driver.findElement(By.partialLinkText("Skip"));
//		WebElement partialLinkText5 = driver.findElement(By.partialLinkText("Skip"));
		
		
		WebElement nameElement1 = driver.findElement(By.name("description"));
		WebElement nameElement2 = driver.findElement(By.name("robots"));
		WebElement nameElement3 = driver.findElement(By.name("twitter:card"));
		WebElement nameElement4 = driver.findElement(By.name("twitter:title"));
		WebElement nameElement5 = driver.findElement(By.name("twitter:description"));
//		
		WebElement cssSelector1 = driver.findElement(By.cssSelector("style#classic-theme-styles-inline-css"));
		WebElement cssSelector2 = driver.findElement(By.cssSelector("style#global-styles-inline-css"));
		WebElement cssSelector3 = driver.findElement(By.cssSelector("script.rank-math-schema-pro"));
		WebElement cssSelector4 = driver.findElement(By.cssSelector("style.gtranslate_css"));
		WebElement cssSelector5 = driver.findElement(By.cssSelector("style[id=classic-theme-styles-inline-css]"));
		
		
		WebElement xpathElement1 = driver.findElement(By.xpath("//a[@data-lasso-id='147434']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//a[@href='/live-selenium-project.html']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//img[@src='/images/home/java.png']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//a[@href='/try-java-editor.html']"));
		
		
		WebElement tagName1 = driver.findElement(By.tagName("a"));
		WebElement tagName2 = driver.findElement(By.tagName("img"));
		WebElement tagName3 = driver.findElement(By.tagName("button"));
		WebElement tagName4 = driver.findElement(By.tagName("meta"));
		WebElement tagName5 = driver.findElement(By.tagName("li"));
	}

	public static void main(String[] args) {
		LocatingMethods locatingmethods = new LocatingMethods();
		locatingmethods.initializeBrowser();
		locatingmethods.locators();
		locatingmethods.driverQuit();
	}
}


