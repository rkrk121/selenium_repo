package testyantraAssighnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://www.aveda.de xpath in makeup, select all the products listed

public class XpathinMakeup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aveda.de/products/17976/best-sellers");
		driver.findElement(By.xpath("//button[.='Ablehnen']")).click();
		Thread.sleep(2000);
		//Actions actions = new Actions(driver);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeAsyncScript("window.scrollBy(0,300)");
		//WebElement makeup = driver.findElement(By.xpath("//div[@class='mpp-filter-set__choices']//a[.=' Makeup ']"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(makeup));
		//js.executeAsyncScript("argument[0].click()", makeup);
		//actions.click(makeup).perform();
		List<WebElement> allProducts = driver.findElements(By.xpath("//a[@class='js-spp-link']"));
		for (WebElement product : allProducts) 
		{
			System.out.println(product.getText());
			
		}


	
		

	}

}
