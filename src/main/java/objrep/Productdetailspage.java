package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetailspage {
	
	
	
	static WebDriver driver;

	
	public Productdetailspage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement ptxt;
	@FindBy(name="save_to_cart") static WebElement savecr;
	@FindBy(xpath="//*[@id=\"Description\"]/h2") static WebElement costitem;
	@FindBy(xpath="//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]") static WebElement addite;
	@FindBy(id="checkOutButton") static WebElement cb;


	
	public static WebElement productname() {
		
		return ptxt;
		
	}
	
public static WebElement savetocart() {
		
		return savecr;
		
	}
public static WebElement itemcost() {
	
	return costitem;
	
}

public static WebElement additems() {
	
	return addite;
	
}

public static WebElement checkoutb() {
	
	return cb;
	
}
}
