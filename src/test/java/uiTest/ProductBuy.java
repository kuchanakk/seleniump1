package uiTest;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Extentreport;
import commonmethods.Scrnshot;
import objrep.Homepage;
import objrep.Loginpage;
import objrep.Orderspage;
import objrep.Productdetailspage;
import testbase.Browser;

public class ProductBuy extends Browser {
	
	static Homepage hp;
	static Productdetailspage pdp;
	static Exceldata excel;
	static Browser b ;
	static Extentreport extr;
	static Scrnshot sch;
	static Loginpage lp;
	static Orderspage op;
	
	
	@BeforeTest
	public static void testsetp() {
		
		Extentreport extr = new Extentreport();
		extr.extentsetup();

	}
	
	
	@AfterTest
	public static void repgener() {
		extr.repgen();
		
	}
	
	@BeforeMethod
	public static void openbrowser() {
		 b = new Browser();
		b.invokebrowserNdnavigate();
		
		
	}
	@AfterMethod(enabled=false)
	public static void closebr() {
		b.closebrowser();
	}
	
	@Test
	public static void buyproduct() throws InterruptedException, IOException {
		 lp = new Loginpage(driver);
		 hp = new Homepage(driver);
		  op = new Orderspage(driver);
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 Thread.sleep(15000);
		 wait.until(ExpectedConditions.elementToBeClickable(hp.tablink()));
		 hp.tablink().click();
		  pdp= new Productdetailspage(driver);
		/*
		 * String itemcost=pdp.itemcost().getText(); System.out.println(itemcost);
		 * String itemcostreal=itemcost.substring(1); double
		 * rcost=Double.parseDouble(itemcostreal); System.out.println(rcost);
		 */
		 Thread.sleep(10000);
//wait.until(ExpectedConditions.elementToBeClickable(pdp.additems())).click();
		pdp.additems().click();
		 Thread.sleep(10000);
		 //wait.until(ExpectedConditions.elementToBeClickable(pdp.savetocart())).click();

		pdp.savetocart().click();
		 Thread.sleep(10000);
		 //wait.until(ExpectedConditions.elementToBeClickable(hp.menucart())).click();

		 hp.menucart().click();
		 Thread.sleep(10000);

		 pdp.checkoutb().click();
		 String acturl=driver.getCurrentUrl();
		 //String expectedurl= "http://advantageonlineshopping.com/#/login";
		 
		 if(acturl.contains("login")) {
			 
			 lp.username().sendKeys("kuchanak");
			 lp.password().sendKeys("0123456kK");
			 Thread.sleep(5000);
			 lp.login().click();
			 
		 }
		 
		Thread.sleep(15000);
		 op.nextbutton().click();
			Thread.sleep(15000);
op.safeusername().clear();
		 op.safeusername().sendKeys("kirank");
		 op.safepwd().clear();
		 op.safepwd().sendKeys("0123456kK");
			Thread.sleep(10000);

		 op.paybutton().click();
		 String trackorder=op.trackingnumber().getText();
		 System.out.println(trackorder);
		 Scrnshot sc = new Scrnshot();
		 sc.screenshot();
	}
	

}
