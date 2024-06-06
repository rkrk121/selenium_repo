package testyantraAssighnment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//if you have 10 windows,how to close 7th window
public class Test {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int n=9;
		for(int i=0; i<n; i++)
		{
			driver.switchTo().newWindow(WindowType.TAB);
		}
		Set<String> allwindows = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(allwindows);
		driver.switchTo().window(windowHandlesList.get(6));
		//driver.close();
		

	}

}
