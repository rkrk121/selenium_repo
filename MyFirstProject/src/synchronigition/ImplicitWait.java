package synchronigition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		//Launch the empty browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Triger the URL
		driver.get("https://trello.com");
		//click on login link
		WebElement loginLink = driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]/a[text()='Log in']"));
		loginLink.click();
		//Thread.sleep(2000);
		//V and V of loginpage
		String expectedLoginPageTitle = driver.getTitle();
		System.out.println("expectedLoginPageTitle= " + expectedLoginPageTitle);
		String actualLogiPageTitle = "Log in to continue - Log in with Atlassian account";
		System.out.println("actualLogiPageTitle = "+ actualLogiPageTitle);
		//Enter the Email
		WebElement userNameTextfield = driver.findElement(By.id("username"));
		userNameTextfield.sendKeys("rkrk121@gmail.com");
		//click on continue Button
		WebElement continueButton = driver.findElement(By.id("login-submit"));
		continueButton.submit();
		//enter the password
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		passwordTextfield.sendKeys("Rahul098@");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.submit();
		//Thread.sleep(2000);
		//V and V BoardsPage
		String expectedBoardsPageTitle = driver.getTitle();
		System.out.println("expectedBoardsPageTitle = " +expectedBoardsPageTitle);
		String actualBoardsPageTitle = "Boards | Trello";
		System.out.println("actualBoardsPageTitle = " + actualBoardsPageTitle);
		//click on createBoard
		WebElement createNewBoard = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoard.click();
		//Thread.sleep(2000);
		//Enter The Board Title
		WebElement boardTitleTextfield = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		boardTitleTextfield.sendKeys("Bathchm4");
		//Thread.sleep(2000);
		//V and V Createoard
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
		createButton.click();
		//Thread.sleep(2000);
		////V and V expectedCreateBoardPage
		String expectedCreateBoardPage=driver.getTitle();
		System.out.println("expectedCreateBoardPage = " + expectedCreateBoardPage);
		String actualCreateBoardPage = "Bathchm4 | Trello";
		System.out.println("actualCreateBoardPage = " + actualCreateBoardPage);
		System.out.println("Hurry...........sucessful");
		driver.manage().window().minimize();
		
		
		
		
		
	
		
	}

}
