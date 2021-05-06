package Actions;


import org.openqa.selenium.WebDriver;

import Elements.OrangeUpdatePersonalDetails_elements;
import Steps.Common_steps;

public class OrangeUpdatePersonalDetails_actions {
private WebDriver driver;
	
	OrangeUpdatePersonalDetails_elements orangeUpdatePersonalDetails_elements;

	public OrangeUpdatePersonalDetails_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeUpdatePersonalDetails_elements = new OrangeUpdatePersonalDetails_elements(driver);
	}
	
	public void clickEditButton() {
		orangeUpdatePersonalDetails_elements.empSaveButton.click();
	}
	
	public void enterEmployeeId(String id) {
		orangeUpdatePersonalDetails_elements.empid.sendKeys(id);
	}
	
	public void enterSSNNumber(String ssnnumber) {
		orangeUpdatePersonalDetails_elements.empnicno.sendKeys(ssnnumber);
	}
	
	public void enterSINNumber(String sinno) {
		orangeUpdatePersonalDetails_elements.empsinno.sendKeys(sinno);
	}
	
	public void enterLicenceNumber(String liceno) {
		orangeUpdatePersonalDetails_elements.emplicenno.sendKeys(liceno);
	}
		
	public void enterDateOfBirthday(String dob) {
		orangeUpdatePersonalDetails_elements.empdob.sendKeys(dob);
	}
	
	public void clickSaveButton() {
		orangeUpdatePersonalDetails_elements.empSaveButton.click();
	}

}
