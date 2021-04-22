package uiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objrep.Homepage;
import testbase.Browser;

@Test
public class Popularitemssize extends Browser {

	
	
	public static void pitemssize() throws InterruptedException {
		
		Browser b = new Browser();
		b.invokebrowserNdnavigate();
		Homepage hp = new Homepage(driver);
		Thread.sleep(5000);
		
		hp.poplink().click();
		int pitemssize=hp.popularblock().findElements(By.tagName("div")).size();
		Assert.assertEquals(pitemssize, 3);
		
		
		
	}
	
	
	

}
