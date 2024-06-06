package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfEnumInSendKeys {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys(Keys.CONTROL +"a");
		userNameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
