package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstCryMovetoEle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.firstcry.com/");
		WebElement boyFashionLink = driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
		WebElement girlFashionLink = driver.findElement(By.xpath("//a[text()=' GIRL FASHION']"));
		WebElement footwearLink = driver.findElement(By.xpath("//a[text()=' Footwear']"));
		WebElement toysLink = driver.findElement(By.xpath("//a[text()=' Toys']"));
		WebElement diaperingtyLink = driver.findElement(By.xpath("//a[text()=' Diapering']"));
		WebElement gearLink = driver.findElement(By.xpath("//a[text()=' Gear']"));
		WebElement feedingLink = driver.findElement(By.xpath("//a[text()=' Feeding']"));
		WebElement bathLink = driver.findElement(By.xpath("//a[text()=' Bath']"));
		WebElement nurseryLink = driver.findElement(By.xpath("//a[text()=' Nursery']"));
		WebElement momsLink = driver.findElement(By.xpath("//a[text()=' Moms']"));
		WebElement healthLink = driver.findElement(By.xpath("//a[text()=' Health']"));
		WebElement boutiquesLink = driver.findElement(By.xpath("//a[text()=' Boutiques']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(boyFashionLink).pause(2000).moveToElement(girlFashionLink).pause(1000)
				.moveToElement(footwearLink).pause(1000).moveToElement(toysLink).pause(1000)
				.moveToElement(diaperingtyLink).pause(1000).moveToElement(gearLink).pause(1000)
				.moveToElement(feedingLink).pause(1000).moveToElement(bathLink).pause(1000).moveToElement(nurseryLink)
				.pause(1000).moveToElement(momsLink).pause(1000).moveToElement(healthLink).pause(1000)
				.moveToElement(boutiquesLink).perform();

	}

}
