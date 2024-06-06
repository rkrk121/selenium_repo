package testyantraAssighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//'https://www.maccosmetics.com'  Write xpath for 'shop Now' button

public class XpathforShopnow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.maccosmetics.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='close']")).click();
		driver.findElement(By.xpath("//span[.='SHOP NOW']")).click();
		

	}

}
