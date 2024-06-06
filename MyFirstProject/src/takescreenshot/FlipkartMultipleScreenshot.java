package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultipleScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https:www.flipkart.com/");
		List<WebElement> multipleEle = driver.findElements(By.xpath("//img[@class='_2puWtW _3a3qyb']"));
		int count=0;
		for (WebElement element : multipleEle) 
		{
			File temp = element.getScreenshotAs(OutputType.FILE);
			File per = new File("multipleElements/"+timeStamp+count+"elements.png");
			FileUtils.copyFile(temp, per);
			count++;	
		}
		driver.manage().window().minimize();
		driver.quit();
		
	

	}

}
