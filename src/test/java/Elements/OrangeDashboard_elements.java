package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeDashboard_elements {
	WebDriver driver;
	
	@FindBy(css="#menu_pim_viewMyDetails > b")
	public WebElement myinfolink;
	
	public OrangeDashboard_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
