package demoqspider;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.id("browserLink1")).click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) 
		{
			String title = driver.switchTo().window(wid).getCurrentUrl();
			if(title.equals("https://demoapps.qspiders.com/ui/browser/SignUpPage"))
			{
				break;
			}	
		}
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("confirm-password")).sendKeys("12345");
		driver.findElement(By.xpath("[text()='Sign Up'")).click();
		

	}

}
