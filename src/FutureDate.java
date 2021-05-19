import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class FutureDate{
		
	   public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\binna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/date-picker");
			driver.manage().window().maximize();
		
			String month= "June 2021";
			String day= "18";
			//driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).click();
			//driver.findElement(By.xpath("//div[contains(text(),'18')]"));
			//driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
			//driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).sendKeys("06/18/2021");
			//driver.findElement(By.xpath("//div[contains(text(),'June 2021')]")).click();
			//driver.findElement(By.xpath("//div[contains(text(),'18')]")).click();
			
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, 0);
			cal.add(Calendar.MONTH, 1);
			cal.add(Calendar.YEAR, 0);
				Date d = cal.getTime();
				System.out.println("Date d :: " + d );
			SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");			
			String dateString = sdf.format(d);
			System.out.println("Date Format (MM/DD/YYYY) :: " + dateString);
		
	   }
	}