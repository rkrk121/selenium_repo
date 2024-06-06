package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextfield = driver.findElement(By.name("username"));
		// WebElement passwordTextfield = driver.findElement(By.name("password"));
		Actions actions = new Actions(driver);
		//actions.keyDown(usernameTextfield, Keys.CONTROL).sendKeys(usernameTextfield, "a")
			//	.keyUp(usernameTextfield, Keys.CONTROL).sendKeys(usernameTextfield, Keys.DELETE)
			//	.sendKeys(usernameTextfield, "ADMIN").perform();
		actions.keyDown(usernameTextfield, Keys.CONTROL).sendKeys(usernameTextfield, "a")
				.keyUp(usernameTextfield, Keys.CONTROL).sendKeys(usernameTextfield, Keys.DELETE)
				.keyDown(usernameTextfield, Keys.SHIFT).sendKeys(usernameTextfield, "hi how are")
				.keyUp(usernameTextfield, Keys.SHIFT).sendKeys(usernameTextfield, "fine tq").perform();

	}

}
