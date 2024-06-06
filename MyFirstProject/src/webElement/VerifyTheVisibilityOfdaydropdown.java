package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheVisibilityOfdaydropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		if(dayDropDown.isDisplayed())
		{
			System.out.println("a/c to method true");
			System.out.println("a/c to client true");
		}
		else
		{
			System.out.println("a/c to method false");
			System.out.println("a/c to client false");
		}
		driver.manage().window().minimize();
		driver.quit();
		
		

	}

}
