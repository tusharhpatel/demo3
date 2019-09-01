import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justdemo {

	public static void main(String[] args) {
		
			WebDriver driver ;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\tusha\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.get("https://www.yahoo.com");
				driver.manage().window().maximize();
				//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			}
			
			
			   
		
		
	}


