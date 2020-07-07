package listnerspack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.project.Ecommerce.Basetest;

public class Listener extends Basetest implements ITestListener {
	public void onTestFailure(ITestResult result) {
		if(!result.isSuccess()) {
			try {
				File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile,new File(projectpath+"//failure"+filepath+".png"));
			}catch(IOException e) {
				e.printStackTrace();
				
			}
			Reporter.log("<a href='" + projectpath+"//failure//"+filepath+".png" + "'> <img src='" + projectpath+"//failure//"+filepath+".png" + "' height='100' width='100'/> </a>");
			Reporter.log("Test has Failed:"+result.getMethod().getMethodName());
		}
			
		}
	public void onTestSuccess(ITestResult obj1) {
		if(obj1.isSuccess()) {
			try {
				File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile,new File(projectpath+"success"+filepath+".png"));
				Reporter.log("<a href='" + projectpath+"//failure//"+filepath+".png" + "'> <img src='" + projectpath+"//success//"+filepath+".png" + "' height='100' width='100'/> </a>");
				Reporter.log("Test has passed:"+obj1.getMethod().getMethodName());
				
				
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		
	}

		public void onTestStart(ITestResult arg0) {
			Reporter.log("Test Started Running:"+arg0.getMethod().getMethodName());
			
		}

		

		

		public void onTestSkipped(ITestResult result) {
	    Reporter.log("Test is Skipped:"+result.getMethod().getMethodName());
			
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		public void onStart(ITestContext context) {
			
			
		}

		public void onFinish(ITestContext context) {
			
			
		}
}
