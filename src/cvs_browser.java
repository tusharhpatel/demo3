import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cvs_browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.walgreens.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Actions actions= new Actions(driver);
		//WebElement moveonmenu= driver.findElement(By.xpath("//a[@aria-haspopup='true']"));
		//actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.id("rx_settings"))).click().perform();
		
		String title=driver.getTitle();
		System.out.println("Title="+title);
		
		String Url=driver.getCurrentUrl();
		System.out.println("URL="+Url);
		
		//String PageSource= driver.getPageSource();
		//System.out.println("Soruce="+ PageSource);
		
		
		driver.findElement(By.xpath("//a[@title='Your account']")).click();
		Actions actions = new Actions(driver);
		WebElement mouseover= driver.findElement(By.xpath("//a[@title='Your account']"));
		actions.moveToElement(mouseover).moveToElement(driver.findElement(By.xpath("//a[@title='Account Home']"))).click().perform();
		
		 
		driver.navigate().back();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@ title='No thanks']")).click();
		//Alert confirmation_box=driver.switchTo().alert();
		//String confirmation_text=confirmation_box.getText();
		//System.out.println("confirm="+confirmation_box);
		//confirmation_box.dismiss();
		
		Actions menu= new Actions(driver);
		WebElement moveonmenu=driver.findElement(By.id("menu-shop-products"));
		menu.moveToElement(moveonmenu).moveToElement(driver.findElement(By)))).click().perform();
		
		Actions actions1 = new Actions(driver);
		WebElement mouseover1 =driver.findElement(By.id("menu-photo"));
		actions.moveToElement(mouseover1).moveToElement(driver.findElement(By.id("calendars"))).click().perform();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		

	}
}
