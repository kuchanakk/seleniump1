package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
static WebDriver driver;

	
	public Loginpage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	
	@FindBy(name="usernameInOrderPayment") static WebElement uname;
	@FindBy(name="passwordInOrderPayment") static WebElement pwd;
	@FindBy(id="login_btnundefined") static WebElement login;
	
	
public static WebElement username() {
		
		return uname;
		
	}
	
public static WebElement password() {
		
		return pwd;
		
	}
public static WebElement login() {
	
	return login;
	
}

}
