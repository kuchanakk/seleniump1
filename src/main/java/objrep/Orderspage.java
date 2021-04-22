package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderspage {
	
	
	static WebDriver driver;

	
	public Orderspage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
		//@Findby(att="value") static webelement name;
		@FindBy(id="next_btn") static WebElement nextb;
		@FindBy(name="safepay_username") static WebElement spuser;
		@FindBy(name="safepay_password") static WebElement sppwd;
		@FindBy(id="pay_now_btn_SAFEPAY") static WebElement payb;

		@FindBy(xpath="//html/body/div[3]/section/article/div[2]/div/p") static WebElement track;

		public static WebElement nextbutton() {
			
			return nextb;
			
		}
		
		public static WebElement safeusername() {
			
			return spuser;
			
		}
		
		

		public static WebElement safepwd() {
			
			return sppwd;
			
		}
		
	public static WebElement paybutton() {
			
			return payb;
			
		}
	public static WebElement trackingnumber() {
		
		return track;
		
	}

}
