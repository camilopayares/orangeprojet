package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdateEmergencyContacts_elements {
	WebDriver driver;
	
	@FindBy(id="btnAddContact")
	public WebElement btnaddcontact;
	
	@FindBy(id="emgcontacts_name")
	public WebElement emgcontactsname;
	
	@FindBy(id="emgcontacts_relationship")
	public WebElement emgcontactsrelationship;
	
	@FindBy(id="emgcontacts_homePhone")
	public WebElement emgcontactshomephone;
	
	@FindBy(id="emgcontacts_mobilePhone")
	public WebElement emgcontactsmobilephone;
	
	@FindBy(id="emgcontacts_workPhone")
	public WebElement emgcontactsworkphone;
	
	@FindBy(id="btnSaveEContact")
	public WebElement btnsaveecontact;
	
	@FindBy(id="delContactsBtn")
	public WebElement delcontactsbtn;
	
	@FindBy(id="btnAddAttachment")
	public WebElement btnaddattachment;
	
	@FindBy(id="ufile")
	public WebElement ufile;
	
	@FindBy(id="txtAttDesc")
	public WebElement attdesc;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement btnsaveattachment;
	
	@FindBy(id="btnDeleteAttachment")
	public WebElement btndeleteattachment;
		
	public OrangeUpdateEmergencyContacts_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
