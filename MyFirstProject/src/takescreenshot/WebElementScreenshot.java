package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//-----https://www.royalchallengers.com/-------
	driver.get("https://www.royalchallengers.com/");
	WebElement rcblog = driver.findElement(By.xpath("//div[@class=\"hdr-logo\"]/..//img"));
	File tempFile = rcblog.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./bugshots/rcblogo.png");
	FileUtils.copyFile(tempFile, permFile);
	driver.manage().window().minimize();
	driver.quit();
		
		
		

	}

}
