package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		WebElement doubleClickEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//actions.doubleClick(doubleClickEle).perform();
		//actions.click(doubleClickEle).perform();
		actions.contextClick(doubleClickEle).perform();//it is right click on the double click me to see

	}

}
