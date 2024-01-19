package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base {
	
	@Test
	public void verifyTheHeaderOfTable() {
		
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		
		ArrayList<String> expectedHeadings = new ArrayList<String>();
        expectedHeadings.add("Name");
        expectedHeadings.add("Position");
        expectedHeadings.add("Office");
        expectedHeadings.add("Age");
        expectedHeadings.add("Start date");
        expectedHeadings.add("Salary");
        
        List<WebElement> headingElements = driver.findElements(By.xpath("//tr[@role='row']//th"));
        
        ArrayList<String> actualHeadings = new ArrayList<String>();
        for (WebElement headingElement : headingElements) {
            actualHeadings.add(headingElement.getText());
        }
        
//        if (actualHeadings.equals(expectedHeadings)) {
//            System.out.println("All headings are present and in the correct order.");
//        } else {
//            System.out.println("Headings verification failed!");
//        }
        //we use assert instead of if else
        assertEquals(expectedHeadings, actualHeadings, "Headings verification failed!");
 
	}
	
	@Test
	public void verifyTheNameAshtonCox() {
		
		String expectedName = "Ashton Cox";
		boolean isAshtonCoxPresent = false;
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		
        List<WebElement> oddRows = driver.findElements(By.xpath("//tr[@class='odd']//td"));
        for (WebElement nameItem : oddRows) {
			String actualName = nameItem.getText();
			if(expectedName.equals(actualName)) {
				isAshtonCoxPresent = true;
				break;
			}
		}

        assertTrue(isAshtonCoxPresent, "Searched Item " + expectedName + " is not found!");
	}
	
	@Test
	public void assertSample1() {
		boolean flag = false;
		assertFalse(flag, "Flag is true.");
	}
	
	@Test
	public void assertSample2() {
		boolean flag = false;
		int a=5, b=8;
		String s = null;
		String str = "Hello";
		assertNotEquals(a, b, "a and b are equal");
		assertNull(s, "s is not null");
		assertNotNull(str, "str is null");
	}
	
	

}























