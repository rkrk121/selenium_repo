package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataAfterCheckingForValue {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstNameTextField = driver.findElement(By.name("firstname"));
		String firstNameValue = firstNameTextField.getAttribute("value");
		System.out.println("firstNameValue = " + firstNameValue);
		if(firstNameValue.isEmpty())
		{
			firstNameTextField.sendKeys("qsp");
		}
		else
		{
			firstNameTextField.clear();
			firstNameTextField.sendKeys("abc");
		}
	}

}
