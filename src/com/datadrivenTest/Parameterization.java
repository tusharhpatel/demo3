package com.datadrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Uitility.Test.Xls_Reader;




public class Parameterization {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Xls_Reader  reader = new Xls_Reader("C:\\Users\\tusha\\workspace\\Practical\\src\\main\\java\\com\\Testdata\\RegTestData.xlsx");
		
       String firstname = reader.getCellData("RegTestData","FirstName", 2);
            System.out.println(firstname);
          String lastname = reader.getCellData("RegTestData","LastName", 2);
            System.out.println(lastname);
         String username=   reader.getCellData("RegTestData","UserName", 2);
            System.out.println(username);
           String password= reader.getCellData("RegTestData"," Password", 2);
            System.out.println(password);
         String conpass =  reader.getCellData("RegTestData","Confirm", 2);
            System.out.println(password);

		
		
	}


}