import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//get commands
public class Demo_2 {

	public static void main(String[] args) throws InterruptedException {
      System.getProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Downloads\\chromedriver_win32 (6).zip");
		WebDriver driver = new ChromeDriver();

		//get command to open URL
		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();
		//get title
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
	}
}