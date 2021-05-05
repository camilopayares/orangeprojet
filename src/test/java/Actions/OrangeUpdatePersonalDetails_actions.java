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
	
	public void enterFirstName(String firstname) {
		orangeUpdatePersonalDetails_elements.empfirstname.sendKeys(firstname);
	}
	
	public void enterMiddleName(String middlename) {
		orangeUpdatePersonalDetails_elements.empmiddlename.sendKeys(middlename);
	}
	
	public void enterLastName(String lastname) {
		orangeUpdatePersonalDetails_elements.emplastname.sendKeys(lastname);
	}
	
	public void enterEmployeeId(String id) {
		orangeUpdatePersonalDetails_elements.empid.sendKeys(id);
	}
	
	public void enterLicenceNumber(String liceno) {
		orangeUpdatePersonalDetails_elements.emplicenno.sendKeys(liceno);
	}
	
	public void enterLicenceExpirationDate(String licexpdate) {
		orangeUpdatePersonalDetails_elements.emplicexpdate.sendKeys(licexpdate);
	}
	
	public void enterSSNNumber(String ssnnumber) {
		orangeUpdatePersonalDetails_elements.empnicno.sendKeys(ssnnumber);
	}
	
	public void enterEmployeeOtherId(String otherid) {
		orangeUpdatePersonalDetails_elements.empotherid.sendKeys(otherid);
	}
	
	public void enterSINNumber(String sinno) {
		orangeUpdatePersonalDetails_elements.empsinno.sendKeys(sinno);
	}
	
	public void clickMale(String male) {
		orangeUpdatePersonalDetails_elements.empoptgender1.sendKeys(male);
	}
	public void clickFemale(String female) {
		orangeUpdatePersonalDetails_elements.empoptgender2.sendKeys(female);
	}
	
	public void enterMaritalStatus(String maritalstatus) {
		orangeUpdatePersonalDetails_elements.empmaritalstatus.sendKeys(maritalstatus);
	}
	
	public void enterNacionality(String nationality) {
		orangeUpdatePersonalDetails_elements.empnationality.sendKeys(nationality);
	}
	
	public void enterDateOfBirthday(String dob) {
		orangeUpdatePersonalDetails_elements.empdob.sendKeys(dob);
	}
	
	public void enterNickName(String nickname) {
		orangeUpdatePersonalDetails_elements.empnickname.sendKeys(nickname);
	}
	
	public void clickSmokeFlag(String smoker) {
		orangeUpdatePersonalDetails_elements.empsmokeflag.sendKeys(smoker);
	}
	public void enterMilitaryService(String militaryservice) {
		orangeUpdatePersonalDetails_elements.empmilitaryser.sendKeys(militaryservice);
	}
	
	public void clickSaveButton() {
		orangeUpdatePersonalDetails_elements.empSaveButton.click();
	}
	
	public void clickEditCustomButton() {
		orangeUpdatePersonalDetails_elements.empeditcustombutton.click();
	}
	
	public void enterBloodType(String bloodtype) {
		orangeUpdatePersonalDetails_elements.empbloodtype.sendKeys(bloodtype);
	}
	
	public void clickAddAttachmentButton() {
		orangeUpdatePersonalDetails_elements.empaddattachmentbutton.click();
	}
	
	public void clickUploadeFile() {
		orangeUpdatePersonalDetails_elements.empufile.click();
	}
	
	public void enterAttDescription(String attdesc) {
		orangeUpdatePersonalDetails_elements.empattdesc.sendKeys(attdesc);
	}
	
	public void clickSaveAttachment() {
		orangeUpdatePersonalDetails_elements.empsaveattacment.click();
	}
	
	public void clickCancelButton() {
		orangeUpdatePersonalDetails_elements.empcancelbutton.click();
	}	
}
