
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class demo_tour1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("http://www.newtours.demoaut.com/");
		
		WebElement UserName= driver.findElement(By.name("userName"));
		UserName.sendKeys("demo");
		WebElement Password= driver.findElement(By.name("password"));
		Password.sendKeys("demo");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("tripType")).isSelected();
		driver.findElement(By.name("passCount")).sendKeys("3");
		
		
		Select departing_dropdown=new Select(driver.findElement(By.name("fromPort")));
		departing_dropdown.selectByVisibleText("New York");
		
		Select departing_month=new Select(driver.findElement(By.name("fromMonth")));
		departing_month.selectByValue("3");
		Select departing_day=new Select(driver.findElement(By.name("fromDay")));
		departing_day.selectByValue("26");
		Select arriving_city=new Select(driver.findElement(By.name("toPort")));
		arriving_city.selectByVisibleText("London");
		Select returing_month=new Select(driver.findElement(By.name("toMonth")));
		returing_month.selectByVisibleText("June");
		Select returning_day=new Select(driver.findElement(By.name("toDay")));
		returning_day.selectByIndex(8);
		Thread.sleep(2000);
		
		driver.findElement(By.name("servClass")).click();
		
		Select airline=new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		
		//String tag=driver.findElement(By.name("login")).getTagName();
		//System.out.println("Tag="+ tag);
		
		String pagesource=driver.getPageSource();
		System.out.println("Page source="+ pagesource);
		
		org.openqa.selenium.Point coordinates=driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).getLocation();
		System.out.println("Coordinates="+coordinates);
		
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
