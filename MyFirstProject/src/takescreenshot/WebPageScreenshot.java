package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.the-maharajas.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./errorshot/"+ timeStamp +"webpage.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
