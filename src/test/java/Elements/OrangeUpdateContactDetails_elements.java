package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdateContactDetails_elements {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Contact Details')]")
	public WebElement btncontactdetails;
		
	@FindBy(id="contact_street1")
	public WebElement empcontactstreet1;
	
	@FindBy(id="contact_street2")
	public WebElement empcontactstreet2;
	
	@FindBy(id="contact_city")
	public WebElement empcontactcity;
	
	@FindBy(id="contact_province")
	public WebElement empcontactprovince;
	
	@FindBy(id="contact_emp_zipcode")
	public WebElement  empzipcode;
	
	@FindBy(id="contact_country")
	public WebElement  empcountry;
	
	@FindBy(id="contact_emp_hm_telephone")
	public WebElement  emphmtelephone;
	
	@FindBy(id="contact_emp_mobile")
	public WebElement  empmobile;
	
	@FindBy(id="contact_emp_work_telephone")
	public WebElement  empworktelephone;
	
	@FindBy(id="contact_emp_work_email")
	public WebElement  empworkmail;
	
	@FindBy(id="contact_emp_oth_email")
	public WebElement  empothermail;
	
	@FindBy(id="btnSave")
	public WebElement btnsave;
		
	public OrangeUpdateContactDetails_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
