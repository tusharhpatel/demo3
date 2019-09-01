import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.yahoo.com/");
		 driver.manage().window().maximize();
		 
		
		 driver.findElement(By.id("uh-mail-link")).click();
		 WebDriverWait wait= new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logo")));
		 
		 String title= driver.getTitle();
		 System.out.println("Title=" + title);
		 
		 driver.findElement(By.id("login-username")).sendKeys("tusharh_patel@yahoo.com");
		 driver.findElement(By.xpath("//input[@value='Next']")).click();
		 driver.findElement(By.id("login-passwd")).sendKeys("Tu786787");
		 driver.findElement(By.xpath("//button[@value='Sign in']")).click();
		// WebDriverWait wait1 = new WebDriverWait(driver,10);
		 //wait1.until(ExpectedConditions.visibilityOfElementLocated(By)));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		}
		
		

	}


