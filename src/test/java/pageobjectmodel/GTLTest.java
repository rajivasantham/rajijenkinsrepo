package pageobjectmodel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GTLTest {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/V1/index.php");
			
			
	  }
  @Test
  public void f() {
	  GtlBankLoginpage g=new GtlBankLoginpage(driver);
	  g.login();
	  String expected="Login successful";
	  Assert.assertEquals(g.checking(), expected);
	  
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
