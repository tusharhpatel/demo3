package ActionCommands;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class chromebrowser {
 WebDriver driver = new FirefoxDriver();
 
 @Before
 public void beforetest() {
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
 }
 
 //@After
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException, IOException 
 { 

  //Generate mouse hover event on main menu to click on sub menu
  Actions actions = new Actions(driver);
  WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
  actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
  
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.titleContains("Google"));
 }
   
}