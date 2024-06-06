package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginWithoutUsingSendKeya {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(Keys.chord("abc@gmail.com"));
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys(Keys.chord("passward@1"));
		passwordTextField.sendKeys(Keys.TAB);
		passwordTextField.sendKeys(Keys.ENTER);
	 // passwordTextField.sendKeys(Keys.TAB);
	    WebElement loginButton = driver.findElement(By.name("login"));
	    loginButton.sendKeys(Keys.ENTER);
		
		

	}

}
