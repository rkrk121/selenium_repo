package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllTheOpts {
public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		List<WebElement> allYearOpts = yearSelect.getOptions();
		System.out.println(allYearOpts.size());
		for (WebElement opt : allYearOpts) 
		{
			String optText = opt.getText();
			System.out.println(optText);
			yearSelect.selectByVisibleText(optText);
			if(opt.isSelected())
			{
				System.out.println("the opt is in the selectable format");
			}
				else
				{
					System.out.println("the opt is not in the selectable format");
				}
			}
		Thread.sleep(2000);
		//month
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		List<WebElement> allMonthOpt = monthSelect.getOptions();
		for (WebElement monthopt : allMonthOpt) 
		{
			String monthOptText = monthopt.getText();
			System.out.println(monthOptText);
			monthSelect.selectByVisibleText(monthOptText);
			if(monthopt.isSelected())
			{
				System.out.println("the month opt are in selectable format");
			}
			else
			{
				System.out.println("the month opt are not in selectable format");
			}
			
		}
		driver.manage().window().minimize();
		driver.quit();
		
			}
		}


