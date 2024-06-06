package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextfield = driver.findElement(By.id("email"));
		String emailTagName = emailTextfield.getTagName();
		if(emailTagName.equals("input"))
		{
		     emailTextfield.sendKeys("abc@gmail.com");
		}
		else 
			
		
		{
			System.out.println("the text field is not created with input tag so we will notbe able to append the data");
		}
		
	    }
    }


