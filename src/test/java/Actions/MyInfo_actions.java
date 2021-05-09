package Actions;

import org.openqa.selenium.WebDriver;

import Elements.MyInfo_elements;
import Steps.Common_steps;

public class MyInfo_actions {
	MyInfo_elements myInfo_elements;
	
	private WebDriver driver;
	
	public MyInfo_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		myInfo_elements = new MyInfo_elements(driver);
	}
	
	public void clickEmergencyContactsLink() {
		myInfo_elements.emergencyContactLink.click();
	}
}
