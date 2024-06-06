package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithItsPrecondition {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement UserNameTextfield = driver.findElement(By.id("username"));
		UserNameTextfield.clear();
		Thread.sleep(2000);
		UserNameTextfield.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passwardTextField = driver.findElement(By.id("password"));
		passwardTextField.clear();
		Thread.sleep(2000);
		passwardTextField.sendKeys("admin");
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInButton.submit();
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
