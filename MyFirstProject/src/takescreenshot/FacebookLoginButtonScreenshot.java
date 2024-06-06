package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginButtonScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		File tempLogin = loginButton.getScreenshotAs(OutputType.FILE);
		File perFile = new File("./screensht/fbloginButton.png");
		FileUtils.copyFile(tempLogin, perFile);
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
