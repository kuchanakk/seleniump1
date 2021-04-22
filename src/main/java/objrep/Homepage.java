package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	static WebDriver driver;

	
public Homepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//@Findby(att="value") static webelement name;
	@FindBy(linkText="POPULAR ITEMS") static WebElement plink;
	@FindBy(xpath="//*[@id=\"popular_items\"]/div") static WebElement popblock;
	@FindBy(id="details_16") static WebElement tab;
	@FindBy(id="details_10") static WebElement lap;
	@FindBy(id="details_21") static WebElement spk;
	@FindBy(id="menuCart") static WebElement menu;

public static WebElement menucart() {
		
		return menu;
		
	}
	
	public static WebElement poplink() {
		
		return plink;
		
	}
	
	

	public static WebElement popularblock() {
		
		return popblock;
		
	}
	
public static WebElement tablink() {
		
		return tab;
		
	}
	
public static WebElement laplink() {
	
	return lap;
	
}
public static WebElement spklink() {
	
	return spk;
	
}	
	
	
}
