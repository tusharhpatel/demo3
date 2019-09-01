



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class canvasdropanddrag {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","/C:\\Users\\tusha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		Map prefs = new HashMap();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);		
		driver.get("http://www.canvaschamp.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions actions =  new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("esns_box_close"))).click();
		Thread.sleep(500);
		WebElement Mouseover = driver.findElement(By.xpath("//*[@id='menu5']/div/a"));
		actions.moveToElement(Mouseover).moveToElement(driver.findElement(By.xpath("//*[@id='popup5']/div/div[1]/div/div/ul/li[2]"))).click().perform();

		String strText = driver.findElement(By.xpath("//span[contains(text(),'$')]")).getText();
		System.out.print(strText);
		WebElement StartClick = driver.findElement(By.className("red-btn"));
		StartClick.click();

		WebElement Mouseover1 = driver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[1]/a"));
		actions.moveToElement(Mouseover1).click().perform();

		String strText1 = driver.findElement(By.xpath("//*[@id='header']/div/div[3]/div[2]/div")).getText();
		System.out.print(strText1);

		//  Assert.assertEquals(strText1, strText);
		System.out.println("Test Passed");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement Mouseover2 = driver.findElement(By.xpath("//*[@id='upload_img']/i"));
		actions.moveToElement(Mouseover2).click().perform();

//		driver.findElement(By.name("uploadart[]")).click();

//		driver.findElement(By.name("uploadart[]")).sendKeys("C:/Users/admin/Pictures/331644.jpg");
		
		StringSelection s = new StringSelection("C:/Users/admin/Pictures/331644.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	    Robot robot = new Robot();
	    robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	    robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	    robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	    robot.keyPress(java.awt.event.KeyEvent.VK_V);
	    robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	    
	    Thread.sleep(5000);

		WebElement dragElementFrom = driver.findElement(By.xpath("//*[@id='draggable']/li/a[1]"));
		WebElement dropElementTo = driver.findElement(By.xpath("//*[@id='design_tool']/div[2]"));

		System.out.println("After element found");
		//
		//		org.openqa.selenium.interactions.Action dragAnddrop = actions.clickAndHold(dragElementFrom)
		//				.moveToElement(dropElementTo).release(dropElementTo).build();
		//		

		actions.clickAndHold(dragElementFrom)
				.moveToElement(dropElementTo)
				.release(dropElementTo)
				.build().perform();    

	}
}


