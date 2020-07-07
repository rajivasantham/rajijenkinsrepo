package com.Alerts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUpload {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://transfer.pcloud.com/");
	  }
  @Test
  public void fileupload() throws InterruptedException, IOException {
	  driver.findElement(By.xpath("//span[contains(text(),'Click here to add files')]")).click();
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("C:\\Users\\VENUG\\Desktop\\Fileupload1.exe");
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
