package Actions;

import org.openqa.selenium.WebDriver;

import Elements.OrangeLogin_elements;
import Steps.Common_steps;

public class OrangeLogin_actions {
private WebDriver driver;
	
	OrangeLogin_elements orangeLogin_elements;

	public OrangeLogin_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeLogin_elements = new OrangeLogin_elements(driver);
	}
	
	public void enterUsername() {
		orangeLogin_elements.loginusername.sendKeys("Admin");
	}
	
	public void enterPassword() {
		orangeLogin_elements.loginpassword.sendKeys("admin123");
	}
	
	public void clickLoginButton() {
		orangeLogin_elements.loginbutton.click();
	}
	
	public void login() {
		enterUsername();
		enterPassword();
		clickLoginButton();
	}
}
