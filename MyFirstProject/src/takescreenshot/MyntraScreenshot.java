package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File perFile = new File("./defectshot/myntrahomepage.png");
		FileUtils.copyFile(tempFile, perFile);
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
