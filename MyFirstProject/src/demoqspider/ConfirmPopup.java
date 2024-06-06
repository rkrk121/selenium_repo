package demoqspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		String confirmMsg = driver.switchTo().alert().getText();
		System.out.println("confirmMsg"+confirmMsg);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}

}
