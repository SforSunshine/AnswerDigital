import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HoverOverButton {

	
	   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		//Action
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("toolTipButton"));
		action.moveToElement(element).build().perform();
		Thread.sleep(1000);
		//Mouse hover actions on an element using Actions Class
		WebElement element2 = driver.findElement(By.id("toolTipTextField"));
		action.moveToElement(element2);
		action.click().build().perform();
		

	}

}

