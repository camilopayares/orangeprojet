<<<<<<< HEAD
package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeEmergencyContacts_elements {
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
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[1]/input")
	public WebElement checkbox;
		
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[2]/a")
	public WebElement nameLink;
	
	@FindBy(css="#listEmegrencyContact > div.head > h1")
	public WebElement assignedContactHeader;
	
	@FindBy(id="emergencyContactHeading")
	public WebElement emergencyContactHeader;
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[2]/a")
	public WebElement firstContactLink;
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[1]/input")
	public WebElement firstContactCheckbox;
	
	public List<WebElement> contactTdWithName(String name) {
		return driver.findElements(By.xpath("//*[@id='emgcontact_list']/tbody/tr/td/a[contains(text(), '" + name + "')]"));
	}
	
	public OrangeEmergencyContacts_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
=======
package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeEmergencyContacts_elements {
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
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[1]/input")
	public WebElement checkbox;
		
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[2]/a")
	public WebElement nameLink;
	
	@FindBy(css="#listEmegrencyContact > div.head > h1")
	public WebElement assignedContactHeader;
	
	@FindBy(id="emergencyContactHeading")
	public WebElement emergencyContactHeader;
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[2]/a")
	public WebElement firstContactLink;
	
	@FindBy(xpath="//*[@id=\"emgcontact_list\"]/tbody/tr[1]/td[1]/input")
	public WebElement firstContactCheckbox;
	
	public List<WebElement> contactTdWithName(String name) {
		return driver.findElements(By.xpath("//*[@id='emgcontact_list']/tbody/tr/td/a[contains(text(), '" + name + "')]"));
	}
	
	public OrangeEmergencyContacts_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
>>>>>>> branch 'master' of https://github.com/camilopayares/orangeprojet.git
