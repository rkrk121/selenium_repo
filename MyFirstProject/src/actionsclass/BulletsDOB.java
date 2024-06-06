package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BulletsDOB {
	// 16/dec/2000
	    //day by using index
	    //month by using value
	    //year by using visible
   public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		daySelect.selectByIndex(15); //value, visible text
		Thread.sleep(2000);
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByValue("12"); //visible text, index
		Thread.sleep(2000);
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByVisibleText("2000");  //index, value
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		

	}

}
