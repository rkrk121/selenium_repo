package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement hindiLink = driver.findElement(By.linkText("हिन्दी"));
		hindiLink.click();
		Thread.sleep(2000);
		WebElement englishLink = driver.findElement(By.partialLinkText("English"));
		englishLink.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
				
		
		

	}

}
