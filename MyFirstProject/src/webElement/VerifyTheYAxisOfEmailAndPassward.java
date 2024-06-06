package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheYAxisOfEmailAndPassward {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		WebElement emailTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
		int emailStartY = emailTextField.getLocation().getY();
		System.out.println("emailStartY = "+ emailStartY);
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		int passwordStartY = passwordTextField.getLocation().getY();
		System.out.println("passwardStartY = " + passwordStartY );
		if(emailStartY==passwordStartY)
		{
			System.out.println("Pass: The email and password text field are starting with the same location through y-axis");
		}
		else
		{
			System.out.println("Fail: The email and password text field are starting with the same location through y-axis");
				
		}
		

	}

}
