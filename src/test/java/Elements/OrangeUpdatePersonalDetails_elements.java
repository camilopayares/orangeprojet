package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeUpdatePersonalDetails_elements {
	WebDriver driver;

	@FindBy(id="personal_txtEmployeeId")
	public WebElement empid;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement  empnicno;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement  empsinno;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement  emplicenno;
	
	@FindBy(css="#personal_DOB")
	public WebElement  empdob;
	
	@FindBy(id="btnSave")
	public WebElement empSaveButton;
		
	public OrangeUpdatePersonalDetails_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
