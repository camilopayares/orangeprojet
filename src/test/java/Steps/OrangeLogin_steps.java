package Steps;

import static org.junit.Assert.fail;

import Actions.Common_actions;
import Actions.OrangeLogin_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLogin_steps {
	Common_actions ca;
	OrangeLogin_actions orangeLogin_actions;
	
	public OrangeLogin_steps(Common_actions ca, OrangeLogin_actions orangeLogin_actions) {
			this.ca = ca;
			this.orangeLogin_actions = orangeLogin_actions;
	}
	@Given("I am on the Login page")
	public void i_am_on_the_login_page() throws Exception {
		 ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 Thread.sleep(4000);
	}
	@When("I enter username and login and I click on Edit button")
	public void i_enter_username_and_login_and_i_click_on_edit_button() {
		orangeLogin_actions.enterUsername();
		orangeLogin_actions.enterPassword();
		orangeLogin_actions.clickLoginButton();
	}
	@Then("I can see the Dashboard Page")
	public void i_can_see_the_dashboard_page() {
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		//String actualUrl = driver.getCurrentUrl();
		String actualUrl = ca.getCurrentUrl();
		if(!expectedUrl.equalsIgnoreCase(actualUrl)) {
			fail("The page is not found");
		}
	}
}
