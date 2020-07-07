package com.project.Ecommerce;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class CheckBox1 extends Basetest{
  
  @BeforeMethod(groups= {"regression","smoke"})
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception {

	  init();
		test=report.startTest("CheckBox1");
		test.log(LogStatus.INFO, "Initializing Properties files......");

		openBrowser(bType);
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
        navigateUrl("checkboxurl");
		test.log(LogStatus.INFO,"Navigated to url :- " + subprop.getProperty("amazonurl"));
		
  }
  @Test(groups= {"regression","smoke"})
  public void checkboxTest() {
	  List<WebElement> check=driver.findElements(By.xpath("//td[@class='tableS	']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
  }

  @AfterMethod(groups= {"regression","smoke"})
  public void afterMethod() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
	
  }

}
