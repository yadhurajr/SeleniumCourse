package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base {
	
	@Test
	public void actionsClassSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggableNOne = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement droppedItem = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(draggableNOne).build().perform();
		//actions.doubleClick(draggableNOne).build().perform();
		//actions.contextClick(draggableNOne).build().perform(); //right click
		actions.dragAndDrop(draggableNOne, droppedItem).build().perform();
	}

}
