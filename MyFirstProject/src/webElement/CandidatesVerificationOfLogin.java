package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandidatesVerificationOfLogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		WebElement loginutton = driver.findElement(By.name("login"));
		if(loginutton.isEnabled())
		{
			loginutton.submit();
			System.out.println("a/c to client---True");
		}
		else {
			System.out.println("The button is disabled----(method------false)");
			System.out.println("a/c to client----false");
		}

	}

}
