package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEleWithXAndYAxis {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		WebElement womenLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
		WebElement kidsLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
		WebElement homelivingLink = driver
				.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
		WebElement beautyLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
		WebElement studioLink = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menLink, 0, 0).pause(1000).moveToElement(menLink, 73, 0).pause(1000)
				.moveToElement(womenLink, 74, 0).pause(1000).moveToElement(kidsLink, 97, 0).pause(1000)
				.moveToElement(homelivingLink, 107, 0).pause(1000).moveToElement(beautyLink, 83, 0).perform();

	}

}
