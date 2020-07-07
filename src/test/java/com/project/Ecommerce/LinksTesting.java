package com.project.Ecommerce;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class LinksTesting extends Basetest {
 
  @BeforeMethod(groups= {"regression"})
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception {

	  init();
		test=report.startTest("LinksTesting");
		test.log(LogStatus.INFO, "Initializing Properties files......");

		openBrowser(bType);
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
        navigateUrl("googleurl");
		test.log(LogStatus.INFO,"Navigated to url :- " + subprop.getProperty("googleurl"));
		
	  
  }
  @Test(groups= {"regression"})
  public void f()
  {
	  String expval="Google Images";
	  driver.findElement(By.linkText("Images")).click();
	  Reporter.log("clicked on Image Link");
	  String actval=driver.getTitle();
	  Assert.assertEquals(actval,expval);
	  
  }

  @AfterMethod(groups= {"regression"})
  public void afterMethod() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
