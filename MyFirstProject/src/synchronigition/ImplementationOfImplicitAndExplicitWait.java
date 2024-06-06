package synchronigition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementationOfImplicitAndExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.trello.com/");
		WebElement loginLink= driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']//a[text()='Log in']"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailTextField = driver.findElement(By.id("username"));
		emailTextField.sendKeys("rkrk121@gmail.com");
		WebElement continueButton = driver.findElement(By.id("login-submit"));
		continueButton.submit();
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("hola098@");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.submit();
		WebElement createNewBoardOpt = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoardOpt.click();
		 
		

	}

}
