import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		

public class Facebook_open {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Desktop\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook will open");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("tusharpatel_india@yahoo.co.in");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("Tusharanjali");
		driver.findElement(By.id("loginbutton")).submit();
		
		Thread.sleep(2000);
		
		//driver.quit();
		//driver.close();
		
		
		
		
		
		
		

	}

}
