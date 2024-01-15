package testscripts;

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
        
        if (actualHeadings.equals(expectedHeadings)) {
            System.out.println("All headings are present and in the correct order.");
        } else {
            System.out.println("Headings verification failed!");
        }
        
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

        if (isAshtonCoxPresent) {
            System.out.println("Name 'Ashton Cox' is present in the Name column.");
        } else {
            System.out.println("Name 'Ashton Cox' is not present in the Name column.");
        }
	}

}
