package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows 
{
   public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//capture all the window id's
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		for(String wid:allWids) 
		{
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
			if(widTitle.equals("Facebook – log in or sign up")) 
			{
			}
			else if(widTitle.equals(widTitle))
			{
			
			String signUpPageURL = driver.getCurrentUrl();
		    System.out.println("signUpPageURL = " +signUpPageURL);
				//size
				int signUpHeight = driver.manage().window().getSize().getHeight();
				System.out.println("signUpHeight = "+signUpHeight);
				int signUpWidth = driver.manage().window().getSize().getWidth();
				System.out.println("signUpWidth = "+signUpWidth);
				//position
				int signUpXAxis = driver.manage().window().getPosition().getX();
				System.out.println("signUpXAxis = "+signUpXAxis);
				int signUpYaxis = driver.manage().window().getPosition().getY();
				System.out.println("signUpYaxis = "+signUpYaxis);
				//set
				Dimension definedSize = new Dimension(300,500);
				driver.manage().window().setSize(definedSize);
				Thread.sleep(2000);
				Point definedPosition = new Point(250,300);
				driver.manage().window().setPosition(definedPosition);
				Thread.sleep(2000);
				
			  }
		  }
	  }
  }


