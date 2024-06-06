package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Nested {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		driver.switchTo().frame(0);
		String frameText = driver.findElement(By.xpath("//span[text()='Sample embedded page']")).getText();
		System.out.println(frameText);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		String frameText1 = driver.findElement(By.xpath("//span[text()='COMPANY']")).getText();
		System.out.println(frameText1);
	
	}

}
