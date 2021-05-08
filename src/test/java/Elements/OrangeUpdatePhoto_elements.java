package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdatePhoto_elements {
	WebDriver driver;
	
	@FindBy(id="empPic")
	public WebElement empPicture;
	
	@FindBy(id="photofile")
	public WebElement photofile;
	
	@FindBy(id="btnSave")
	public WebElement btnUploap;
	
	public OrangeUpdatePhoto_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
