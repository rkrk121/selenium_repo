package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfTitle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		
		System.out.println("actualTitle"+actualTitle);
		System.out.println("expectedTitle"+expectedTitle);
		if(actualTitle.equals(expectedTitle))
		{
		   System.out.println("Pass: The Login page Title is verified and found correct");	
		}
		else {
			System.out.println("failed : The Login page Title is verified and found incorrect");
		}
		
		

	}

}
