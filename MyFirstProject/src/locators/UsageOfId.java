package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//login");
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("rkrk121@gmail.com");
		Thread.sleep(2000);
		//if address is wrong
		//org.openqa.selenium.NoSuchElementException
		//selenium run unchecked
		WebElement passwardTextField = driver.findElement(By.id("pass"));
		passwardTextField.sendKeys("123456789");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		}

}
