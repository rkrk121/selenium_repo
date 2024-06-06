package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {

	public static void main(String[] args) 
	{
	//launch the browser
	//InvalidArgumentException
	//runtime error unchecked if the protocol is not given
		WebDriver driver=new ChromeDriver();
		//triger the url
		driver.get("https://wwww.facebook.com/");
	}

}
