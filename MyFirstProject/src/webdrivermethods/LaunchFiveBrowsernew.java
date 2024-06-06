package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFiveBrowsernew {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://ajio.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://youtube.com/");
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			String widtitle = driver.switchTo().window(wid).getTitle();
			if(widtitle.equals("Facebook – log in or sign up")) {
				String sr= driver.getCurrentUrl();
				System.out.println("current url for facebook is "+sr);
			}
			else {
				
			}
			
			
		}
	}

}
