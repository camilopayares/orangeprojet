package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin_elements {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	public WebElement loginusername;
	
	@FindBy(id="txtPassword")
	public WebElement loginpassword;
	
	@FindBy(id="btnLogin")
	public WebElement loginbutton;
	
	public OrangeLogin_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
