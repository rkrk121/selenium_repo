package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		WebElement womenLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
		WebElement kidsLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
		WebElement homelivingLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
		WebElement beautyLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
		WebElement studioLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
		Actions actions = new Actions(driver);
		
		//actions.moveToElement(menLink).pause(1000).moveToElement(womenLink).pause(1000).moveToElement(kidsLink).pause(1000).moveToElement(homelivingLink).pause(1000).moveToElement(beautyLink).pause(1000).moveToElement(studioLink).perform();
		//men to studio
		//actions.moveToElement(menLink, 0, 0).pause(1000).moveToElement(womenLink, 73, 0).pause(1000).moveToElement(kidsLink, 74, 0).pause(1000).moveToElement(homelivingLink, 97, 0).pause(1000).moveToElement(beautyLink, 107, 0).pause(1000).moveToElement(studioLink, 83, 0).perform();
		//men to kids
		//actions.moveToElement(menLink, 0, 0).pause(1000).moveToElement(menLink, 147, 0).pause(1000).perform();
		//studio to men
		//actions.moveToElement(studioLink, 0, 0).pause(1000).moveToElement(studioLink, -435, 0).perform();
        
		actions.moveToElement(beautyLink, 0, 0).pause(1000).moveToElement(beautyLink, -279, 0).perform();
	}

}
