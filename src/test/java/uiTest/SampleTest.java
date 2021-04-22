package uiTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;
import testbase.Browser;

public class SampleTest extends Browser {
	
	@Test
	public static void test1() throws IOException, InterruptedException {
		Browser b= new Browser();
		
		b.invokebrowserNdnavigate();
		
		//step 1 taking screen shot
		Thread.sleep(5000);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("D:\\adhomepage.png"));
		
		
		// saving 
		
		b.closebrowser();
	}
	
	
	
	

}
