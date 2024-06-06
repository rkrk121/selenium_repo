package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyWithItsPrecondition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement UserNameTextfield = driver.findElement(By.id("username"));
		UserNameTextfield.clear();
		Thread.sleep(2000);
		 String usernameValue = UserNameTextfield.getAttribute("value");
		 if(usernameValue.isEmpty())
		 {
			 UserNameTextfield.sendKeys("abc");
		 }
		 else
		 {
			 UserNameTextfield.clear();
			 Thread.sleep(2000);
			 UserNameTextfield.sendKeys("xyz");
		 }
		}
      }