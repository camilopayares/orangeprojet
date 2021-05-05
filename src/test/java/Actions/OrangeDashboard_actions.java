package Actions;

import org.openqa.selenium.WebDriver;
import Elements.OrangeDashboard_elements;
import Steps.Common_steps;

public class OrangeDashboard_actions {
private WebDriver driver;
	
	OrangeDashboard_elements orangeDashboard_elements;

	public OrangeDashboard_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeDashboard_elements = new OrangeDashboard_elements(driver);
	}
	
	public void clickMyInfoLink() {
		orangeDashboard_elements.myinfolink.click();
	}
	
}
