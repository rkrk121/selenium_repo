package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheEleColorMalaicha {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		//WebElement loginButton = driver.findElement(By.xpath("//button[text()='Register']"));//rgba(253, 137, 1, 1)////#fd8901//register
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign In']"));//rgba(253, 137, 1, 1)//#fd8901 //signin
		  String backgroundcolorOfLogin = loginButton.getCssValue("background-color");       
		  System.out.println("backgroundcolorOfLogin: " + backgroundcolorOfLogin);
		 String hexValueOfBackgroundColor = Color.fromString(backgroundcolorOfLogin).asHex();
		 System.out.println("hexValueOfBackgroundColor:"+hexValueOfBackgroundColor);
		
		
	}

}
