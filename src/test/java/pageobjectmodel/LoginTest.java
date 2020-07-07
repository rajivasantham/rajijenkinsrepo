package pageobjectmodel;

import org.testng.annotations.Test;

import com.project.Ecommerce.Basetest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends Basetest {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() throws Exception {
		init();
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	  }
	@Test
	public void registration() throws Exception {
		CustomerRegistrationPage cr=new CustomerRegistrationPage(driver);
		cr.customerRegistration();
	}
	
  @Test(enabled=false)
  public void f() throws Exception {
	  LoginPage p=new LoginPage(driver);
	  p.customerLogin();
	  String expectedMsg="Authentication failed.";
	  Assert.assertEquals(p.verifyError(), expectedMsg);
	  
	  
	  
	  
	  
	  /* driver.findElement(By.linkText("Sign in")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).sendKeys("qatest876768@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("password");
	  driver.findElement(By.id("SubmitLogin")).click();
	  
	  String actualMsg= driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
	  String ExpectedMsg="Authentication failed.";
	  
	  Assert.assertEquals(actualMsg, ExpectedMsg);*/
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
