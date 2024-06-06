package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheStateOfElement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(2000);
        WebElement submitOpt = driver.findElement(By.name("submit"));
        if(submitOpt.isEnabled())
        {
        	System.out.println("The submit enabled----Method(True)");
        	System.out.println("But a/c client it is false");
        	submitOpt.click();
        }
        else
        {
        	System.out.println("The submitOpt is enabled ------Method(False)");
        	System.out.println("But a/c client it is True");
        	WebElement acceptTermsofServiceOpt = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
        	acceptTermsofServiceOpt.click();
        	Thread.sleep(2000);
        	WebElement acceptTermsofServiceCheckBox = driver.findElement(By.id("confbtn"));
        	acceptTermsofServiceCheckBox.click();
        	Thread.sleep(2000);
        	WebElement closeOpt = driver.findElement(By.xpath("//button[text()='Close']"));
        	closeOpt.click();
        	Thread.sleep(2000);
        	submitOpt.click();
        	Thread.sleep(2000); 	
        }
        driver.manage().window().minimize();
        driver.quit();
		 
   
	}

}
