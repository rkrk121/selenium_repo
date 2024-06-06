package qspider_assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillray {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		WebElement imageSource = driver.findElement(By.xpath("//img[@src='https://www.skillrary.com/uploads/images/f-sr-logo-195-50.png']"));
		if(imageSource.isDisplayed())
		{
			System.out.println("Skillrary image is present");
		}
		else
		{
			System.out.println("Skillrary image is not present");
		}

	}

}
