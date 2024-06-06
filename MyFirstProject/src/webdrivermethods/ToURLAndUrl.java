package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURLAndUrl {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en");
		//Store the main url
		URL  mainUrl = new URL("https://www.dassault-aviation.com/en");
		Thread.sleep(2000);
		URL PassianPage = new URL(mainUrl,"Passion/");
		driver.navigate().to(PassianPage);
		Thread.sleep(2000);
		URL defensePage = new URL(mainUrl,"defense/");
		driver.navigate().to(defensePage);
		Thread.sleep(2000);
		URL spacePage = new URL(mainUrl,"espace/");
		driver.navigate().to(spacePage);
		Thread.sleep(2000);
//		driver.navigate().back();
		
		
		

	}

}
