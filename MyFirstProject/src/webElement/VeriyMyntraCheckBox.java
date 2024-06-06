package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriyMyntraCheckBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		WebElement tshirtCheckBox = driver.findElement(By.xpath("//label[text()='Tshirts']/..//input/..//div"));
		if(tshirtCheckBox.isSelected())
		{
			System.out.println("According to method it is false");
			System.out.println("According to client it is false");
		}
		else
		{
			System.out.println("According to method it is True");
			System.out.println("According to client it is True");
			tshirtCheckBox.click();
		}
		 
		
		

	}

}
