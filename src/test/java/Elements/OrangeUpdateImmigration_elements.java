package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdateImmigration_elements {
	WebDriver driver;
	
	@FindBy(id="btnAdd")
	public WebElement btnadd;
	
	@FindBy(id="immigration_type_flag_1")
	public WebElement immtypeflag1;
	
	@FindBy(id="immigration_type_flag_2")
	public WebElement immtypeflag2;
	
	@FindBy(id="immigration_number")
	public WebElement immigrationnumber;
	
	@FindBy(id="immigration_passport_issue_date")
	public WebElement immpassportissuedate;
	
	@FindBy(id="immigration_passport_expire_date")
	public WebElement immpassportexpdate;
	
	@FindBy(id="immigration_i9_status")
	public WebElement immi9status;
	
	@FindBy(id="immigration_country")
	public WebElement immcountry;
	
	@FindBy(id="immigration_i9_review_date")
	public WebElement immi9reviewdate;
	
	@FindBy(id="immigration_comments")
	public WebElement immcomments;
	
	@FindBy(id="btnSave")
	public WebElement btnsave;
	
	@FindBy(id="btnCancel")
	public WebElement btncancel;
	
	@FindBy(id="btnDelete")
	public WebElement btndelete;
	
	@FindBy(id="btnAddAttachment")
	public WebElement btnaddattachment;
	
	@FindBy(id="ufile")
	public WebElement ufile;
	
	@FindBy(id="txtAttDesc")
	public WebElement attdesc;
		
	@FindBy(id="btnSaveAttachment")
	public WebElement btnsaveattchment;
	
	@FindBy(id="cancelButton")
	public WebElement cancelbutton;
	
	public OrangeUpdateImmigration_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
