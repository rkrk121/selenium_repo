package synchronigition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAndImplicit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		WebElement loginLink = driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]/a[text()='Log in']"));
		loginLink.click();
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailTextfield = driver.findElement(By.id("username"));
		emailTextfield.sendKeys("rkrk121@gmail.com");
		WebElement continueButton = driver.findElement(By.id("login-submit"));
		continueButton.submit();
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		passwordTextfield.sendKeys("Rahul098@");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.submit();
		wait.until(ExpectedConditions.urlToBe("https://trello.com/u/rkrk121/boards"));
		WebElement createNewBoardOpt = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoardOpt.click();
		WebElement boardTextfield = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		boardTextfield.sendKeys("selenium");
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.click();
		driver.manage().window().minimize();
		//driver.quit();
		
		
		

	}

}
