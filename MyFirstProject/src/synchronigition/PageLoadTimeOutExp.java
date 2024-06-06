package synchronigition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.timeout.TimeoutException;

public class PageLoadTimeOutExp {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try 
		{
			driver.get("https://www.flipkart.com/");
		}
		catch(TimeoutException e)
		{
			System.out.println("the flipcart app is not having the capacity to load page within specified time");
		}
	}
}
