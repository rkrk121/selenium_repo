package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dob_Vivek {
	//01-09-1996
	//01---index
	    //09---value
	    //1996---visible text
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/signup");
	   Thread.sleep(2000);
	  //day
	   WebElement dayDropDown = driver.findElement(By.id("day"));
	   Select daySelect = new Select(dayDropDown);
	   daySelect.selectByIndex(0);
	   Thread.sleep(2000);
	  //month
	   WebElement monthDropDown = driver.findElement(By.id("month"));
	   Select monthSelect = new Select(monthDropDown);
	   monthSelect.selectByValue("9");
	   Thread.sleep(2000);
	 //year
	   WebElement yearDropDown = driver.findElement(By.id("year"));
	   Select yearSelect = new Select(yearDropDown);
	   yearSelect.selectByVisibleText("1996");
	   Thread.sleep(2000);
	   driver.manage().window().minimize();
	   driver.quit();
	}

}
