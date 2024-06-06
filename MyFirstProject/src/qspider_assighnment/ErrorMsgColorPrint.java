package qspider_assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMsgColorPrint {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		WebElement errorMsgEle = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		System.out.println(errorMsgEle.getText());
		System.out.println(errorMsgEle.getCssValue("color"));
		

	}

}
