<<<<<<< HEAD
package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyInfo_elements {
	
	private WebDriver driver;

	public MyInfo_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css="#sidenav > li:nth-child(3) > a")
	public WebElement emergencyContactLink;
}
=======
package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyInfo_elements {
	
	private WebDriver driver;

	public MyInfo_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css="#sidenav > li:nth-child(3) > a")
	public WebElement emergencyContactLink;
}
>>>>>>> branch 'master' of https://github.com/camilopayares/orangeprojet.git
