package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StateOfDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		if(daySelect.isMultiple())
		{
			System.out.println("The drop down is multi select");
		}
		else
		{
			System.out.println("The drop down is single select");
			daySelect.selectByIndex(25);
		}

	}

}
