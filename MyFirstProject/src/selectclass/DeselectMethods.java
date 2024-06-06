package selectclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rahu,lsl/OneDrive/Desktop/select&deselect/option.html");
		WebElement carsDropDown = driver.findElement(By.id("cars"));
		Select carsSelect = new Select(carsDropDown);
		if(carsSelect.isMultiple())
		{
			carsSelect.selectByValue("volvo");
			Thread.sleep(1000);
			carsSelect.selectByValue("opel");
			Thread.sleep(1000);
			carsSelect.selectByVisibleText("Audi");
			Thread.sleep(1000);
			carsSelect.selectByIndex(1);
			Thread.sleep(1000);
			//carsSelect.deselectAll();
			
			carsSelect.deselectByValue("audi");	
		}
		else
		{
			System.out.println("the drop down is single select");
		}
		Thread.sleep(1000);
		driver.manage().window().minimize();
		driver.quit();																																																																										
	}

}
