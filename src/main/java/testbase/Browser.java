package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	
	public void invokebrowserNdnavigate() {
		
		String browser="firefox";
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}else if(browser.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
			
		}
		
		
		
		driver.get("http://advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	public void closebrowser() {
		
		driver.close();
	}
	
	
	
	
	

}
