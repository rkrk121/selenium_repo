package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.name("login"));
		Actions actions = new Actions(driver);
		//actions.sendKeys("abc@gmail.com").sendKeys(passwordTextfield, "1234").click(loginButton).perform();
		actions.sendKeys("abc@gmail.com").sendKeys(passwordTextfield, "1234").sendKeys(loginButton, Keys.ENTER).perform();
	}

}
