package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	static ExtentReports extent;
	static ExtentTest test1;
	public static void extentsetup() {
		
		
		 extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test1=extent.createTest("MyFirstTest");
	}
	
	
	public static void testpass() {
		
		
		test1.log(Status.PASS,"test is passed");
	}
	
public static void testfail() {
		
		
		test1.log(Status.FAIL,"test is failed");
	}
	
	
	public static void repgen() {
		
		extent.flush();
		
	}
	
	
	public static void scrshotadd() {
		
		test1.addScreenCaptureFromPath("D:\\prodtext.png");
		
	}
	
}
