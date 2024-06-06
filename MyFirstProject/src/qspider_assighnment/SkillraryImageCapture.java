package qspider_assighnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryImageCapture {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		WebElement skillraryImg = driver.findElement(By.xpath("//img[@src='https://www.skillrary.com/uploads/images/f-sr-logo-195-50.png']"));
		File tempFile = skillraryImg.getScreenshotAs(OutputType.FILE);
		File perFile = new File("./errorshot/SkillraryImg.png");
		FileUtils.copyFile(tempFile, perFile);
		driver.manage().window().minimize();
		driver.quit();

	}

}
