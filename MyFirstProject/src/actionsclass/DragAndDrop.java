package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement dragableEle = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(dragableEle, 100, 60).perform();
	}

}
