package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloClickAndHoldScenarios {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.trello.com");
		driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']")).click();
		driver.findElement(By.id("username")).sendKeys("rkrk121@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).submit();
		driver.findElement(By.id("password")).sendKeys("Rahul098@");
		driver.findElement(By.id("login-submit")).submit();
	    driver.findElement(By.xpath("//span[text()='Create new board']")).click();
		driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']")).sendKeys("BatchM4");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		WebElement textField = driver.findElement(By.xpath("//h2[.='To Do']/following-sibling::textarea[@data-testid='list-name-textarea']"));
		textField.sendKeys("Topics");
		driver.findElement(By.xpath("//button[.='Add a card']")).click();
		
	}

}
