package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAltText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement groceryImg = driver.findElement(By.xpath("//a[@aria-label='Grocery']//img"));
		String groceryImgAltText = groceryImg.getAttribute("alt");
		System.out.println("groceryImgAltText = " + groceryImgAltText);
		

	}

}
