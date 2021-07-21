package Steps;

import static org.junit.Assert.fail;

import Actions.Common_actions;
import Actions.OrangeDashboard_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeDashboard_steps {
	
	Common_actions ca;
	OrangeLogin_steps orangeLogin_steps;
	OrangeDashboard_actions orangeDashboard_actions;
	public OrangeDashboard_steps(Common_actions ca, OrangeLogin_steps orangeLogin_steps, OrangeDashboard_actions orangeDashboard_actions, Common_steps cs) {
		this.ca = ca;
		this.orangeLogin_steps = orangeLogin_steps;
		this.orangeDashboard_actions = orangeDashboard_actions;
	}
	
	@Given("I am on the Dashboard page")
	public void i_am_on_the_dashboard_page() throws Exception {
		ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		orangeLogin_steps.i_enter_username_and_login_and_i_click_on_login_button(); 
		Thread.sleep(4000);
	}
	
	@When("I click on MyInfo link")
	public void i_click_on_my_info_link() throws Exception {
		orangeDashboard_actions.clickMyInfoLink();
		Thread.sleep(4000);
	}
	

	@Then("I can see the MyInfo Page")
	public void i_can_see_the_my_info_page() {
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";
		//String actualUrl = driver.getCurrentUrl();
		String actualUrl = ca.getCurrentUrl();
		if(!expectedUrl.equalsIgnoreCase(actualUrl)) {
			fail("The page is not found");
		}
	}



	
	
}
