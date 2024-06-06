package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheOpts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1:5500/multi.html");
		WebElement carsDropDown = driver.findElement(By.id("cars"));
		Select carsSelect = new Select(carsDropDown);
		if(carsSelect.isMultiple())
		{
			System.out.println("The drop down is multi select");
			carsSelect.selectByVisibleText("Audi");
			Thread.sleep(2000);
			carsSelect.selectByVisibleText("Saab");
			Thread.sleep(2000);
			carsSelect.selectByVisibleText("Volvo");
			Thread.sleep(2000);
			carsSelect.selectByVisibleText("Opel");
			Thread.sleep(2000);
			//carsSelect.deselectAll();
			carsSelect.deselectByIndex(1);
			Thread.sleep(2000);
			carsSelect.deselectByValue("Audi");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("The drop Down is single select");
		}
		driver.manage().window().minimize();
		driver.quit();	
		}
	}


