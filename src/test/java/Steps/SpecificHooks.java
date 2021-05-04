package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SpecificHooks {
	private WebDriver driver;

	public SpecificHooks(Common_steps cs) {
		this.driver = cs.getDriver();
	}
	
	@Before(value = "@SetCookie") //Scenario Specific Hook
	public void setcookie(){
		System.out.println("Scenario specific hook - Before");
	}
	@After(value = "@SetCookie") //Scenario Specific Hook
	public void validatecookie(){
		System.out.println("Scenario specific hook - After");
	}
}

