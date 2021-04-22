package uiTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sparkreports {
	
	@Test
	public static void exampl1() {
		
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

		extent.attachReporter(spark);
		ExtentTest test1=extent.createTest("MyFirstTest");
				
		int a = 15;
		int b = 6;
		
		
		if (a<b) {
			test1.log(Status.PASS, " a is less then b so test is pass");
			
			System.out.println("test is pass");
		}else {
			
			test1.log(Status.FAIL, "a is not less then b so test is fail");
			
			System.out.println("test is fail");
		}
		
		
		
		extent.flush();
		
		
	}
	
	
	
	
	
	

}
