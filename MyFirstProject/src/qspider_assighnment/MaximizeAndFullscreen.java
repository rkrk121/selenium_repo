package qspider_assighnment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullscreen {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Window window = driver.manage().window();
		window.maximize();
		Thread.sleep(2000);
		window.fullscreen();
		

	}

}
