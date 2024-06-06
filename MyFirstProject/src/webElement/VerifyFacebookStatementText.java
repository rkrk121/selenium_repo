package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.io.coder.raw.RawDecoder;

public class VerifyFacebookStatementText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement sloganFacebook = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String sloganText = sloganFacebook.getText();
		if(sloganText.equals("Facebook helps you connect and share with the people in your life."))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
			
		}
	
	}

}
