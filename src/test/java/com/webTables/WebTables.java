package com.webTables;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebTables {
	WebDriver driver;
	@BeforeMethod
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void dynamicTable() {
	  //Checks for Table RowCount
	  List<WebElement> tr_collection=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	  System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
	  int row_num,col_num;
	  row_num=1;
	  for(WebElement trElement:tr_collection) {
		 List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
		 //System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
		 col_num=1;
		 for(WebElement tdElement:td_collection ) {
		System.out.println("Row # "+row_num+", Col # "+col_num  + ", Text=" +tdElement.getText());
		col_num++;
		 }
		 row_num++;
		  
	  }
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
