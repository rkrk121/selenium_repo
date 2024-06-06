package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheStartingPositionOfEmailAndPassword {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email x-axis
		WebElement emailTextField = driver.findElement(By.id("email"));
		int emailStartX = emailTextField.getLocation().getX();
		System.out.println("emailStartX = " + emailStartX);
		//password x-axis
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		int passwordStartX = passwordTextField.getLocation().getX();
		System.out.println("passwordStartX = " + passwordStartX);
		if(emailStartX==passwordStartX)
		{
			System.out.println("Pass: The starting location of email and password text field is verified and found correct.");
		}
		else 
		{
			System.out.println("Fail: The starting location of email and password text field is verified and found incorrect.");
		}
		

	}

}
