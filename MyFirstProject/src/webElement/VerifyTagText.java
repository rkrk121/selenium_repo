package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[contains(@href, 'https://www.facebook.com/recover/initiate/?privacy')]"));
		String forgotpasswordText = forgotPasswordLink.getText();
		if(forgotpasswordText.equals("Forgotten password?"))
		{
			forgotPasswordLink.click();
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
