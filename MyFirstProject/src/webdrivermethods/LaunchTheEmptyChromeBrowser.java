package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheEmptyChromeBrowser 
{
public static void main(String[] args) 
	{
	//launch the empty cb
	//OOAD
	WebDriver driver = new ChromeDriver();
	driver.close();
	}
}