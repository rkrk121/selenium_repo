package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheVisibilityOfAnElement {
	//ele is not present in the UIof an appln, but the ele source code is
	//present in the HTML document.[not to use isDisplayed() upon this scenario]

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement invisibleElement = driver.findElement(By.name("preferred_pronoun"));
		if(invisibleElement.isDisplayed())
		{
			System.out.println("method-----True");
			System.out.println("client-----False");
		}
		else
		{
			System.out.println("method-----False");
			System.out.println("client-----True");
		}
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
