package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testbase.Browser;

public class Scrnshot extends Browser {

	
	public static void screenshot() throws InterruptedException, IOException {
		
	
		
		Thread.sleep(5000);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("user.dir"+"//scht//orderdetails.png"));
		
	}
	
	
}
