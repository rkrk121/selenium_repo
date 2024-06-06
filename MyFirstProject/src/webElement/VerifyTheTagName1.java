package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		String dateTagName = dateDropDown.getTagName();
		if(dateTagName.equals("select"))
		{
			dateDropDown.click();
		}
		else
		{
			System.out.println("The dropdown Element is not made of select tag so we cannot enter the data");
		}
		
	}

}
