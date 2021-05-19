import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("Kim");
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("Brown");
		driver.findElement(By.id("userEmail")).click();
		driver.findElement(By.id("userEmail")).sendKeys("Kim@example.com");
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0113247598");
		driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys("19-05-2021");
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div//div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("English");
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\binna\\Downloads\\AnswerDigitalLogo.png");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).click();
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Union Mills\r\n"
				+ "9 Dewsbury Road\r\n"
				+ "Leeds\r\n"
				+ "LS11 5DD");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}

}
