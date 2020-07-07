package com.project.Ecommerce;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends Basetest {
public static ExtentReports extent;
public static ExtentReports getInstance() {
	if(extent==null) {
		Date dt=new Date();
		String filepath=dt.toString().replace(":", "_").replace(" ", "_");
		extent=new ExtentReports(projectpath+"//HTMLReports//"+filepath);
		extent.loadConfig(new File(projectpath+"//extentconfigreport.xml"));
	extent.addSystemInfo("Selenium Langauge", "3.11.0").addSystemInfo("Environment","production");
	}
	return extent;
	
	
}
}
