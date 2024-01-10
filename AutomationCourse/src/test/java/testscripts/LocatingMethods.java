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
//		WebElement idElement1 = driver.findElement(By.id("classic-theme-styles-inline-css"));
//		WebElement idElement2 = driver.findElement(By.id("global-styles-inline-css"));
//		WebElement idElement3 = driver.findElement(By.id("kadence-blocks-global-variables-inline-css"));
//		WebElement idElement4 = driver.findElement(By.id("kadence_blocks_css-inline-css"));
//		WebElement idElement5 = driver.findElement(By.id("kadence-global-inline-css"));
//		
//		
//		WebElement headerElement1 = driver.findElement(By.className("rank-math-schema-pro"));
//		WebElement headerElement2 = driver.findElement(By.className("gtranslate_css"));
//		WebElement headerElement3 = driver.findElement(By.className("site-mobile-header-wrap"));
//		WebElement headerElement4 = driver.findElement(By.className("gsc-results-wrapper-overlay"));
//		WebElement headerElement5 = driver.findElement(By.className("gsc-results-close-btn"));
//		
//		
//		WebElement linkText1 = driver.findElement(By.linkText("Skip to content"));
//		WebElement linkText2 = driver.findElement(By.linkText("Execute Java Online"));
//		WebElement linkText3 = driver.findElement(By.linkText("Execute Javascript"));
//		WebElement linkText4 = driver.findElement(By.linkText("Execute HTML"));
//		WebElement linkText5 = driver.findElement(By.linkText("Execute Python"));
//		
//		
//		WebElement partialLinkText1 = driver.findElement(By.partialLinkText("Skip"));
//		WebElement partialLinkText2 = driver.findElement(By.partialLinkText("Execute"));
//		WebElement partialLinkText3 = driver.findElement(By.partialLinkText("SAP"));
//		WebElement partialLinkText4 = driver.findElement(By.partialLinkText("Skip"));
//		WebElement partialLinkText5 = driver.findElement(By.partialLinkText("Skip"));
//		
//		
//		WebElement nameElement1 = driver.findElement(By.name("description"));
//		WebElement nameElement2 = driver.findElement(By.name("robots"));
//		WebElement nameElement3 = driver.findElement(By.name("twitter:card"));
//		WebElement nameElement4 = driver.findElement(By.name("twitter:title"));
//		WebElement nameElement5 = driver.findElement(By.name("twitter:description"));
//		
//		WebElement cssSelector1 = driver.findElement(By.cssSelector("style#classic-theme-styles-inline-css"));
//		WebElement cssSelector2 = driver.findElement(By.cssSelector("style#global-styles-inline-css"));
//		WebElement cssSelector3 = driver.findElement(By.cssSelector("script.rank-math-schema-pro"));
//		WebElement cssSelector4 = driver.findElement(By.cssSelector("style.gtranslate_css"));
//		WebElement cssSelector5 = driver.findElement(By.cssSelector("style[id=classic-theme-styles-inline-css]"));
//		
//		
//		WebElement xpathElement1 = driver.findElement(By.xpath("//a[@data-lasso-id='147434']"));
//		WebElement xpathElement2 = driver.findElement(By.xpath("//a[@href='/live-selenium-project.html']"));
//		WebElement xpathElement3 = driver.findElement(By.xpath("//img[@src='/images/home/java.png']"));
//		WebElement xpathElement4 = driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']"));
//		WebElement xpathElement5 = driver.findElement(By.xpath("//a[@href='/try-java-editor.html']"));
//		
//		
//		WebElement tagName1 = driver.findElement(By.tagName("a"));
//		WebElement tagName2 = driver.findElement(By.tagName("img"));
//		WebElement tagName3 = driver.findElement(By.tagName("button"));
//		WebElement tagName4 = driver.findElement(By.tagName("meta"));
//		WebElement tagName5 = driver.findElement(By.tagName("li"));
		
		//contains
		WebElement xpathContains1 = driver.findElement(By.xpath("//a[contains(@href,'/try-java-e')]"));
		WebElement xpathContains2 = driver.findElement(By.xpath("//a[contains(@data-lasso-id,'147434')]"));
		WebElement xpathContains3 = driver.findElement(By.xpath("//img[contains(@src,'/images/home/selenium-logo.p')]"));
		WebElement xpathContains4 = driver.findElement(By.xpath("//td[contains(@class,'gsib_a')]"));
		WebElement xpathContains5 = driver.findElement(By.xpath("//a[contains(@href,'/software-testing-career-complete-guide.ht')]"));
		
		//starts-with
		WebElement xpathStartsWith1 = driver.findElement(By.xpath("//a[starts-with(@href,'/try-')]"));
		WebElement xpathStartsWith2 = driver.findElement(By.xpath("//img[starts-with(@src,'/images/home/seleniu')]"));
		WebElement xpathStartsWith3 = driver.findElement(By.xpath("//input[starts-with(@class,'gsc')]"));
		WebElement xpathStartsWith4 = driver.findElement(By.xpath("//a[starts-with(@href,'/software-testing-')]"));
		WebElement xpathStartsWith5 = driver.findElement(By.xpath("//a[starts-with(@href,'/execute-html-onl')]"));
		
		//text()
		WebElement xpathTextElement1 = driver.findElement(By.xpath("//a[text()='➤ Business Analyst']"));
		WebElement xpathTextElement2 = driver.findElement(By.xpath("//h1[text()='Tutorials Library']"));
		WebElement xpathTextElement3 = driver.findElement(By.xpath("//a[text()='Advertise with Us']"));
		WebElement xpathTextElement4 = driver.findElement(By.xpath("//p[text()='Top Tutorials']"));
		WebElement xpathTextElement5 = driver.findElement(By.xpath("//a[text()='➤ Operating System']"));
		
		//and or
		WebElement xpathAndOrElement1 = driver.findElement(By.xpath("//a[text()='➤ Business Analyst' and @href='/business-analyst-tutorial-course.html']"));
		WebElement xpathAndOrElement2 = driver.findElement(By.xpath("//a[text()='➤ Live Selenium Project' or @title='Live Selenium Project']"));
		WebElement xpathAndOrElement3 = driver.findElement(By.xpath("//h4[text() = 'Selenium' and @class='kt-blocks-info-box-title']"));
		WebElement xpathAndOrElement4 = driver.findElement(By.xpath("//a[text() = 'Quiz' or @href='/tests.html']"));
		WebElement xpathAndOrElement5 = driver.findElement(By.xpath("//a[text() = 'Privacy Policy' and @href='/privacy-policy']"));	
		
		//parent
		WebElement xpathParent1 = driver.findElement(By.xpath("//a[@href='/try-java-editor.html']//parent::div"));
		WebElement xpathParent2 = driver.findElement(By.xpath("//a[@href='/execute-javascript-online.html']//parent::div"));
		WebElement xpathParent3 = driver.findElement(By.xpath("//img[@src='/images/home/Linux.png']//parent::a"));
		WebElement xpathParent4 = driver.findElement(By.xpath("//h1[@class='thick-heading']//parent::div"));
		WebElement xpathParent5 = driver.findElement(By.xpath("//img[@src='/images/home/selenium-logo.png']//parent::a"));
		
		//ancestor
		WebElement xpathAncestor1 = driver.findElement(By.xpath("//a[@href='/try-java-editor.html']//ancestor::div[@class='site-footer-wrap']"));
		WebElement xpathAncestor2 = driver.findElement(By.xpath("//a[@href='/selenium-tutorial.html']//ancestor::div[@class='site-header-inner-wrap']"));
		WebElement xpathAncestor3 = driver.findElement(By.xpath("//img[@src='/images/home/python.png']//ancestor::a"));
		WebElement xpathAncestor4 = driver.findElement(By.xpath("//h4[@class='kt-blocks-info-box-title']//ancestor::div[@id='wrapper']"));
		WebElement xpathAncestor5 = driver.findElement(By.xpath("//a[@href='/affiliate-earning-disclaimer']//ancestor::p"));
		
		//child
		WebElement xpathChildElement1 = driver.findElement(By.xpath("//div[@class='site-header-wrap']//child::div[@class='site-header-inner-wrap']"));
		WebElement xpathChildElement2 = driver.findElement(By.xpath("//div[@id='mobile-header']//child::div[@class='site-header-inner-wrap']"));
		WebElement xpathChildElement3 = driver.findElement(By.xpath("//div[@id='inner-wrap']//child::div[@class='content-area']"));
		WebElement xpathChildElement4 = driver.findElement(By.xpath("//main[@class='site-main']//child::div[@class='content-wrap']"));
		WebElement xpathChildElement5 = driver.findElement(By.xpath("//table[@class='gsc-search-box']//child::td[@class='gsc-input']"));
	}

	public static void main(String[] args) {
		LocatingMethods locatingmethods = new LocatingMethods();
		locatingmethods.initializeBrowser();
		locatingmethods.locators();
		locatingmethods.driverQuit();
	}
}


