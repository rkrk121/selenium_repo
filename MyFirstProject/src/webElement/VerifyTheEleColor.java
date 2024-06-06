package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheEleColor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login")); //rgba(24, 119, 242, 1)//#1877f2
		String backgroundcolorOfLogin = loginButton.getCssValue("background-color");       
		System.out.println("backgroundcolorOfLogin: " + backgroundcolorOfLogin);
		String hexValueOfBackgroundColor = Color.fromString(backgroundcolorOfLogin).asHex();
		System.out.println("hexValueOfBackgroundColor:"+hexValueOfBackgroundColor);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		

	}

}
