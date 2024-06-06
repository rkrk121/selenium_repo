package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRect {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement emailTextField = driver.findElement(By.id("email"));
		int emailStartX = emailTextField.getRect().getX();
		System.out.println("emailStartX = " + emailStartX);
		int emailWidth = emailTextField.getRect().getWidth();
		System.out.println("emailWidth = " + emailWidth);
		int emailEndPoint = emailStartX + emailWidth;
		System.out.println("emailEndPoint = " + emailEndPoint);
		//password
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		int passwordStartX = passwordTextField.getRect().getX();
		System.out.println("passwordStartX = " + passwordStartX);
		int passwordWidth = passwordTextField.getRect().getX();
		System.out.println("passwordWidth = " + passwordWidth);
		int passwordEndPoint = passwordStartX + passwordWidth;
		System.out.println("passwordEndPoint = " + passwordEndPoint);
		if(emailEndPoint==passwordEndPoint)
		{
			System.out.println("Pass: The email and password end pint is verified and found correct");
		}
		else
		{
			System.out.println("Pass: The email and password end pint is verified and found correct");
		}
		
	}
}
