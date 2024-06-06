package demoqspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(2000);
		String promptMsg = driver.switchTo().alert().getText();
		System.out.println(" promptMsg");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		

	}

}
