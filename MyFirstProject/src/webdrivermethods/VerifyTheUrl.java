package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl=driver.getCurrentUrl();
		System.out.println("actualUrl"+actualUrl);		
		String expectedUrl= "https://www.facebook.com/";
		System.out.println("expextedUrl"+expectedUrl);
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Pass: The Login page url is verified and found correct");
	    }
		else
		{
			System.out.println("Fail: The Login page url is not verified and  not found correct");
		}
		

	}

}
