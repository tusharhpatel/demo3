package ActionCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tusha\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.icloud.com/");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		    
		
		
	
		
		
		

	}

}
