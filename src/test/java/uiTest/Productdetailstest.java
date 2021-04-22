package uiTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Extentreport;
import commonmethods.Scrnshot;
import objrep.Homepage;
import objrep.Productdetailspage;
import testbase.Browser;

public class Productdetailstest extends Browser {
	
	static Homepage hp;
	static Productdetailspage pdp;
	static Exceldata excel;
	static Browser b ;
	static Extentreport extr;
	static Scrnshot sch;
	
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
	@AfterMethod
	public static void closebr() {
		b.closebrowser();
	}
	
	
	@Test(priority=0)
	public static void tabletdetails() throws IOException, InterruptedException {
		
		 hp = new Homepage(driver);
		 Thread.sleep(5000);
		 hp.tablink().click();
		  pdp = new Productdetailspage(driver);
		String actualtabtext=pdp.productname().getText();
		 excel = new Exceldata();
		String expectedtabtext=excel.readata(3, 0);
		if(actualtabtext.contains(expectedtabtext)) {
			
			System.out.println("test is pass");
			excel.writedata(3, 1, "valida data");
			extr.testpass();
			
		}else {
			
			System.out.println("test is fail");
			excel.writedata(3, 1, "invalida data");
			extr.testfail();
			sch.screenshot();
			extr.scrshotadd();
		}
		
	}
		
		@Test(priority=1)
		public static void laptopdetails() throws IOException, InterruptedException {
			 sch = new Scrnshot();
			 hp = new Homepage(driver);
			 Thread.sleep(5000);

			 hp.laplink().click();
			  pdp = new Productdetailspage(driver);
			String actuallaptext=pdp.productname().getText();
			 excel = new Exceldata();
			String expectedlaptext=excel.readata(1, 0);
			if(actuallaptext.contains(expectedlaptext)) {
				
				System.out.println("test is pass");
				excel.writedata(1, 1, "valida data");
				extr.testpass();
			}else {
				
				System.out.println("test is fail");
				excel.writedata(1, 1, "invalida data");
				extr.testfail();
				sch.screenshot();
				extr.scrshotadd();
				
			}
			}
		
		
			@Test(priority=1)
			public static void spkdetails() throws IOException, InterruptedException {
				
				 hp = new Homepage(driver);
				 Thread.sleep(5000);

				 hp.spklink().click();
				  pdp = new Productdetailspage(driver);
				String actualspktext=pdp.productname().getText();
				 excel = new Exceldata();
				String expectedspktext=excel.readata(2, 0);
				if(actualspktext.contains(expectedspktext)) {
					
					System.out.println("test is pass");
					excel.writedata(2, 1, "valida data");
					extr.testpass();
				}else {
					
					System.out.println("test is fail");
					excel.writedata(2, 1, "invalida data");
					extr.testfail();
					sch.screenshot();
					extr.scrshotadd();
				}
			
			
		
		
	}
	
	
	
	

}
