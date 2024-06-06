package qspider_assighnment;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeTheWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		org.openqa.selenium.Dimension dm = new org.openqa.selenium.Dimension(500, 300);
		driver.manage().window().setSize(dm);
		

	}

}
