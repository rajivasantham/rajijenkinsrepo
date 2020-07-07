package com.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.Ecommerce.Basetest;

public class FrameDemo extends Basetest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			List<WebElement> f= driver.findElements(By.tagName("frame"));
		    System.out.println(f.size());
		
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("Selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("WebDriverBackedSelenium")).click();
		

	}

}
