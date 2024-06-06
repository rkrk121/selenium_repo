package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfSendKeys {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		Actions actions = new Actions(driver);
		actions.sendKeys(passwordTextField, "12345678").perform();
		//actions.sendKeys("12345678").perform();//it will go and enter passward on the active element
		actions.sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.ENTER).perform();
		

	}

}
