package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodDefaultCapacity {
	//scrolling--static webpage

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ContactuploadingandnonusersLink = driver.findElement(By.linkText("Contact uploading and non-users"));
		ContactuploadingandnonusersLink.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
