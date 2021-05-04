package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdateDependents_elements {
	WebDriver driver;
	
	@FindBy(id="btnAddDependent")
	public WebElement btnadddependent;
	
	@FindBy(id="dependent_name")
	public WebElement dependentname;
	
	@FindBy(id="dependent_relationshipType")
	public WebElement dependentrelationshiptype;
	
	@FindBy(id="dependent_dateOfBirth")
	public WebElement dependentdob;
	
	@FindBy(id="btnSaveDependent")
	public WebElement btnsavedependent;
	
	@FindBy(name="chkdependentdel[]")
	public WebElement chkdependentdel;
	
	@FindBy(id="delDependentBtn")
	public WebElement deldependentbtn;
	
	@FindBy(id="btnAddAttachment")
	public WebElement btnaddattachment;
	
	@FindBy(id="ufile")
	public WebElement ufile;
	
	@FindBy(id="txtAttDesc")
	public WebElement attdesc;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement btnsaveattachment;
	
	@FindBy(name="chkattdel[]")
	public WebElement chkattdel;
	
	@FindBy(id="btnDeleteAttachment")
	public WebElement btndeleteattachment;
		
	public OrangeUpdateDependents_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
