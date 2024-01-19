package testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingMultipleWindows extends Base {
	
	@Test
	public void handlingMultipleWindowSample( ) {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement fbButton = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']"));
		fbButton.click();
		String MainWindow = driver.getWindowHandle();		
		
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
            	// Switching to Child window
            	driver.switchTo().window(ChildWindow);
            	WebElement loginButton = driver.findElement(By.xpath("//div[@class='x1c436fg']//child::div[@role='button']"));
            	loginButton.click();
            }
        }
        
	}
}
