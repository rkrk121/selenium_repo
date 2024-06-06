package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown {
	// modifier keys [window,ctrl,shift,alt,fn]

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		Actions actions = new Actions(driver);
		actions.keyDown(usernameTextField, Keys.CONTROL).sendKeys(usernameTextField, "a")
				.keyUp(usernameTextField, Keys.CONTROL).sendKeys(usernameTextField, Keys.DELETE)
				.sendKeys(usernameTextField, "Admin").perform();

	}

}
