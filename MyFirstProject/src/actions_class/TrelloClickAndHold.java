package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://trello.com/");
		WebElement loginLink = driver.findElement(By
				.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]//a[text()='Log in']"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailTextField = driver.findElement(By.id("username"));
		emailTextField.sendKeys("rkrk121@gmail.com");
		WebElement continueButton = driver.findElement(By.id("login-submit"));
		continueButton.submit();
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("Rahul098@");
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginButton.click();
		wait.until(ExpectedConditions.titleIs("Boards | Trello"));
		WebElement createNewBoardOptn = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoardOptn.click();
		WebElement creatBoardTextField = driver
				.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		creatBoardTextField.sendKeys("Course board1");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		// driver.findElement(By.xpath("//button[@data-testid='list-composer-button']")).click();
		WebElement enterListTitleOptn = driver
				.findElement(By.xpath("//form//textarea[@placeholder='Enter list title…']"));
		Actions actions = new Actions(driver);
		actions.sendKeys(enterListTitleOptn, "Topic").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys("java")
				.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys("Manual").sendKeys(Keys.ENTER)
				.pause(Duration.ofSeconds(3)).sendKeys("Sql").sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//textarea[text()='Topic']/../../..//button[text()='Add a card']")).click();

		WebElement cardTitle = driver
				.findElement(By.xpath("//form//textarea[@placeholder='Enter a title for this card…']"));
		actions.sendKeys(cardTitle, "OOPS").sendKeys(cardTitle, Keys.ENTER).pause(Duration.ofSeconds(3))
				.sendKeys("Agile").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys("Normalization")
				.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys("Exception").sendKeys(Keys.ENTER)
				.pause(Duration.ofSeconds(3)).sendKeys("Static methods").sendKeys(Keys.ENTER)
				.pause(Duration.ofSeconds(3)).sendKeys("RDBMS").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3))
				.sendKeys("defect tacking").sendKeys(Keys.ENTER).build().perform();
		WebElement oopsCard = driver.findElement(By.xpath("//a[text()='OOPS']"));
		WebElement agileCard = driver.findElement(By.xpath("//a[text()='Agile']"));
		WebElement normalizationCard = driver.findElement(By.xpath("//a[text()='Normalization']"));
		WebElement exceptionCard = driver.findElement(By.xpath("//a[text()='Exception']"));
		WebElement staticmethodsCard = driver.findElement(By.xpath("//a[text()='Static methods']"));
		WebElement rdbmsCard = driver.findElement(By.xpath("//a[text()='RDBMS']"));
		WebElement defecttackingCard = driver.findElement(By.xpath("//a[text()='defect tacking']"));
		WebElement javaList = driver.findElement(By.xpath("//h2[text()='java']"));
		WebElement manualList = driver.findElement(By.xpath("//h2[text()='Manual']"));
		WebElement sqlList = driver.findElement(By.xpath("//h2[text()='Sql']"));
		actions.clickAndHold(oopsCard).release(javaList).build().perform();
		actions.clickAndHold(agileCard).release(manualList).build().perform();
		actions.clickAndHold(normalizationCard).release(sqlList).build().perform();
		actions.clickAndHold(exceptionCard).release(javaList).build().perform();
		actions.clickAndHold(staticmethodsCard).release(javaList).build().perform();
		actions.clickAndHold(rdbmsCard).release(sqlList).build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(defecttackingCard).release(manualList).build().perform();

		driver.manage().window().minimize();
		driver.quit();

	}


}
