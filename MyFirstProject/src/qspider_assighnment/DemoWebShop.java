package qspider_assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {

	public static void main(String[] args) 
		 {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
			WebElement booksLink = driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']//a[contains(text(), 'Books')]"));
			booksLink.click();
			WebElement dropDown = driver.findElement(By.id("products-orderby"));
			Select select = new Select(dropDown);
			select.selectByVisibleText("Price: Low to High");

	}

}
