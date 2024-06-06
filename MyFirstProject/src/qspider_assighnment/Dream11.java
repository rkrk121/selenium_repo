package qspider_assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import actions_class.SendKeys;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement framEle = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(framEle);
		//driver.switchTo().frame(driver.findElement(By.id("send-sms-iframe")));
		WebElement textField = driver.findElement(By.id("regEmail"));
		Actions actions = new Actions(driver);
		actions.sendKeys(textField,"9977665544").perform();
		driver.findElement(By.id("regUser")).click();

	}

}
