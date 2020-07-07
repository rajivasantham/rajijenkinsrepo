package com.actionsjavascriptexecutors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		JavascriptExecutor	js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='rajivasantham'");
	    //String var=js.executeScript("return document.title").toString();
		//System.out.println(var);
		//js.executeScript("window.scrollBy(0,100)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("document.getElementById('u_0_w').scrollInToView()");
		//js.executeScript("window.history.back()");
		//Thread.sleep(2000);
		//js.executeScript("window.history.forward()");
		//Thread.sleep(2000);
		//js.executeScript("window.history.go(0)");
		//Thread.sleep(2000);
		
		

	}

}
