package com.project.Ecommerce;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class RadioButton1 extends Basetest {
	
  
  @BeforeMethod(groups= {"regression","smoke"})
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception {

	  init();
		test=report.startTest("RadioButton1");
		test.log(LogStatus.INFO, "Initializing Properties files......");

		openBrowser(bType);
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
        navigateUrl("radiourl");
		test.log(LogStatus.INFO,"Navigated to url :- " + subprop.getProperty("amazonurl"));
		
  }
  @Test(groups= {"regression","smoke"})
  public void radioTest() throws InterruptedException {
	  Thread.sleep(3000);
	
	  WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
	  List<WebElement> rbutton=radio.findElements(By.name("group1"));
	  for(int i=0;i<rbutton.size();i++) {
		  System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
	  }
	  
	  
  }

  @AfterMethod(groups= {"regression","smoke"})
  public void afterMethod() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
