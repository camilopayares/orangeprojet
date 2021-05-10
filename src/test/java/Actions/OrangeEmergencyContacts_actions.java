package Actions;

import org.openqa.selenium.WebDriver;

import Elements.OrangeEmergencyContacts_elements;
import Steps.Common_steps;

public class OrangeEmergencyContacts_actions {
	private WebDriver driver;
	
	OrangeEmergencyContacts_elements emergencyContacts_elements;
	
	public OrangeEmergencyContacts_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		this.emergencyContacts_elements = new OrangeEmergencyContacts_elements(driver);
	}

	public void clickAddButton() {
		emergencyContacts_elements.btnaddcontact.click();
	}
	
	public void clickDeleteButton() {
		emergencyContacts_elements.delcontactsbtn.click();
	}
	
	public boolean assignedContactHeaderIsShown() {
		return emergencyContacts_elements.assignedContactHeader.getText().equals("Assigned Emergency Contacts");
	}
	
	public boolean contactWithNameIsPresent(String name) {
		return !emergencyContacts_elements.contactTdWithName(name).isEmpty();
	}
	
	public boolean addContactHeaderIsShown() {
		return emergencyContacts_elements.emergencyContactHeader.getText().equals("Add Emergency Contact");
	}
	
	public boolean editContactHeaderIsShown() {
		return emergencyContacts_elements.emergencyContactHeader.getText().equals("Edit Emergency Contact");
	}

	public void enterName(String name) {
		emergencyContacts_elements.emgcontactsname.clear();
		emergencyContacts_elements.emgcontactsname.sendKeys(name);
	}

	public void enterRelationship(String relationship) {
		emergencyContacts_elements.emgcontactsrelationship.clear();
		emergencyContacts_elements.emgcontactsrelationship.sendKeys(relationship);
	}

	public void enterHomeTelephone(String home_telephone) {
		emergencyContacts_elements.emgcontactshomephone.clear();
		emergencyContacts_elements.emgcontactshomephone.sendKeys(home_telephone);
	}

	public void enterMobile(String mobile) {
		emergencyContacts_elements.emgcontactsmobilephone.clear();
		emergencyContacts_elements.emgcontactsmobilephone.sendKeys(mobile);
	}

	public void enterWorkTelephone(String work_telephone) {
		emergencyContacts_elements.emgcontactsworkphone.clear();
		emergencyContacts_elements.emgcontactsworkphone.sendKeys(work_telephone);
	}

	public void clickSaveButton() {
		emergencyContacts_elements.btnsaveecontact.click();
	}
	
	public void clickContactLink() {
		emergencyContacts_elements.firstContactLink.click();
	}

	public void selectContactCheckbox() {
		emergencyContacts_elements.firstContactCheckbox.click();
	}
}