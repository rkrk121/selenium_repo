package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VallueAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		String userNameValue = userNameTextField.getAttribute("value");
		if(userNameValue.isEmpty())
		{
			userNameTextField.sendKeys("abc");
			}
		else
		{
			userNameTextField.clear();
			Thread.sleep(2000);
			userNameTextField.sendKeys("xyz");
		}
		
		

	}

}
