package Actions;

import org.openqa.selenium.WebDriver;

import Elements.OrangeUpdateContactDetails_elements;
import Steps.Common_steps;

public class OrangeUpdateContactDetails_actions {
private WebDriver driver;
	
	OrangeUpdateContactDetails_elements orangeUpdateContactDetails_elements;

	public OrangeUpdateContactDetails_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeUpdateContactDetails_elements = new OrangeUpdateContactDetails_elements(driver);
	}
	
	public void clickContactDetailsButton() {
		orangeUpdateContactDetails_elements.btncontactdetails.click();
	}
		
	public void clickEditButton() {
		orangeUpdateContactDetails_elements.btnsave.click();
	}
			
	public void deleteEmployeeContactStreet1() {
		orangeUpdateContactDetails_elements.empcontactstreet1.clear();
	}
	
	public void enterEmployeeContactStreet1(String street1) {
		orangeUpdateContactDetails_elements.empcontactstreet1.sendKeys(street1);
	}
	
	public void deleteEmployeeContactStreet2() {
		orangeUpdateContactDetails_elements.empcontactstreet2.clear();
	}
	
	public void enterEmployeeContactStreet2(String street2) {
		orangeUpdateContactDetails_elements.empcontactstreet2.sendKeys(street2);
	}
	
	public void deleteEmployeeContactCity() {
		orangeUpdateContactDetails_elements.empcontactcity.clear();
	}
	
	public void enterEmployeeContactCity(String city) {
		orangeUpdateContactDetails_elements.empcontactcity.sendKeys(city);
	}
	
	public void deleteEmployeeContactProvince() {
		orangeUpdateContactDetails_elements.empcontactprovince.clear();
	}
	
	public void enterEmployeeContactProvince(String province) {
		orangeUpdateContactDetails_elements.empcontactprovince.sendKeys(province);
	}
	
	public void deleteEmployeeZipCode() {
		orangeUpdateContactDetails_elements.empzipcode.clear();
	}
	
	public void enterEmployeeZipCode(String zipcode) {
		orangeUpdateContactDetails_elements.empzipcode.sendKeys(zipcode);
	}
	
	public void enterEmployeeCountry(String country) {
		orangeUpdateContactDetails_elements.empcountry.sendKeys(country);
	}
	
	public void deleteEmployeeHomeTelephone() {
		orangeUpdateContactDetails_elements.emphmtelephone.clear();
	}
	
	public void enterEmployeeHomeTelephone(String homephone) {
		orangeUpdateContactDetails_elements.emphmtelephone.sendKeys(homephone);
	}
	
	public void deleteEmployeeMobile() {
		orangeUpdateContactDetails_elements.empmobile.clear();
	}
	
	public void enterEmployeeMobile(String mobile) {
		orangeUpdateContactDetails_elements.empmobile.sendKeys(mobile);
	}
	
	public void deleteEmployeeWorkTelephone() {
		orangeUpdateContactDetails_elements.empworktelephone.clear();
	}
	
	public void enterEmployeeWorkTelephone(String workphone) {
		orangeUpdateContactDetails_elements.empworktelephone.sendKeys(workphone);
	}
	
	public void deleteEmployeeWorkEmail() {
		orangeUpdateContactDetails_elements.empworkmail.clear();
	}
	
	public void enterEmployeeWorkEmail(String email) {
		orangeUpdateContactDetails_elements.empworkmail.sendKeys(email);
	}
	
	public void deleteEmployeeOtherEmail() {
		orangeUpdateContactDetails_elements.empothermail.clear();
	}
	
	public void enterEmployeeOtherEmail(String oemail) {
		orangeUpdateContactDetails_elements.empothermail.sendKeys(oemail);
	}

	public void clickSaveButton() {
		orangeUpdateContactDetails_elements.btnsave.click();
	}

}

