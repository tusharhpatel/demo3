import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\tusha\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.canvaschamp.com/");
		driver.manage().window().maximize();
		
		
		Actions actions=new Actions(driver);
		WebElement moveonmenu=driver.findElement(By.id("menu5"));
		actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//a[@title='Wall Display']"))).click().perform();
		
		WebElement moveonmenu1=driver.findElement(By.xpath("//a[@title='Wall Display']"));
		actions.moveToElement(moveonmenu1).moveToElement(driver.findElement(By.xpath("//a[@title='4 Panel Displays']"))).click().perform();
		driver.findElement(By.className("red-btn")).click();
		driver.findElement(By.className("mCS_img_loaded")).click();
		driver.findElement(By.className("tool-upload-1")).click();
		driver.findElement(By.name("uploadart[]")).click();
		driver.findElement(By.name("uploadart[]")).sendKeys("C:\\Users\\tusha\\Desktop\\gatlinburg photos\\IMG_8643.jpg");
		driver.findElement(By.name("uploadart[]")).sendKeys("C:\\Users\\tusha\\Desktop\\gatlinburg photos\\IMG_8644.jpg");
		driver.findElement(By.name("uploadart[]")).sendKeys("C:\\Users\\tusha\\Desktop\\gatlinburg photos\\IMG_8647.jpg");

		WebElement dragelementfrom=driver.findElement(By.id("canvas_container_1"));
		WebElement dragelementto=driver.findElement(By.id("canvas_container_1"));
		
		
		
		actions.clickAndHold(dragelementfrom).moveToElement(dragelementto).release(dragelementto).build().perform();
		
		WebElement dragfrom1=driver.findElement(By.id("canvas_container_left_2"));
		WebElement dragto1=driver.findElement(By.id("canvas_container_left_2"));
		actions.clickAndHold(dragfrom1).moveToElement(dragto1).release(dragto1).build().perform();
		
		
		
		
      
        
        
       // driver.findElement(By.className("fa fa-upload")).sendKeys("C:\\Users\\tusha\\Desktop\\gatlinburg photos");
        
	}

}
