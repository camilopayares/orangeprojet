package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdatePersonalDetails_elements {
	WebDriver driver;

	@FindBy(id="personal_txtEmpFirstName")
	public WebElement empfirstname;
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement empmiddlename;
	
	@FindBy(id="personal_txtEmpLastName")
	public WebElement emplastname;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement empid;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement  emplicenno;
	
	@FindBy(css="#personal_txtLicExpDate")
	public WebElement  emplicexpdate;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement  empnicno;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement  empotherid;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement  empsinno;
	
	@FindBy(id="personal_optGender_1")
	public WebElement  empoptgender1;
	
	@FindBy(id="personal_optGender_2")
	public WebElement  empoptgender2;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement  empmaritalstatus;
	
	@FindBy(id="personal_cmbNation")
	public WebElement  empnationality;
				
	@FindBy(css="#personal_DOB")
	public WebElement  empdob;
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement  empnickname;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement  empsmokeflag;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement  empmilitaryser;
	
	@FindBy(id="btnSave")
	public WebElement empsavebtn;
	
	@FindBy(id="btnEditCustom")
	public WebElement empeditcustombutton;
	
	@FindBy(css="div.box.pimPane:nth-child(1) div.single:nth-child(4) div.inner form:nth-child(1) ol:nth-child(3) li:nth-child(1) > select.editable.valid:nth-child(2)")
	public WebElement empbloodtype;
		
	@FindBy(id="btnAddAttachment")
	public WebElement empaddattachmentbutton;
	
	@FindBy(css="#ufile")
	public WebElement empufile;
	
	@FindBy(id="txtAttDesc")
	public WebElement empattdesc;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement empsaveattacment;
	
	@FindBy(id="cancelButton")
	public WebElement empcancelbutton;
	
	public OrangeUpdatePersonalDetails_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
