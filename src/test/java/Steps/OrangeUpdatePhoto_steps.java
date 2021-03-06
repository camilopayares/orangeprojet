package Steps;

import Actions.Common_actions;
import Actions.OrangeDashboard_actions;
import Actions.OrangeUpdatePhoto_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeUpdatePhoto_steps {
	Common_actions ca;
	OrangeLogin_steps orangeLogin_steps;
	OrangeDashboard_actions orangeDashboard_actions;
	OrangeUpdatePhoto_actions orangeUpdatePhoto_actions;
	
	public OrangeUpdatePhoto_steps(Common_actions ca,
			OrangeLogin_steps orangeLogin_steps,
			OrangeDashboard_actions orangeDashboard_actions,
			OrangeUpdatePhoto_actions orangeUpdatePhoto_actions) {
			this.ca = ca;
			this.orangeLogin_steps = orangeLogin_steps;
			this.orangeDashboard_actions = orangeDashboard_actions;
			this.orangeUpdatePhoto_actions = orangeUpdatePhoto_actions;

	}
	
	@Given("I am on my Personal Details page and I click on my Photo")
	public void i_click_on_my_photo() {
	    // Login and acces to MyInfoLink
		 ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			orangeLogin_steps.i_enter_username_and_login_and_i_click_on_login_button();
			orangeDashboard_actions.clickMyInfoLink();
		// I click on my Photo
			orangeUpdatePhoto_actions.clickOnPhoto();

	}

	@When("I click on Browse and upload a new photo")
	public void i_click_on_browse_and_upload_a_new_photo() {
		orangeUpdatePhoto_actions.enterPhotoFile();

	}

	@Then("My Photo Profil is uploaded with success")
	public void my_photo_profil_is_uploaded_with_success() {
		orangeUpdatePhoto_actions.clickOnUpload();

	}

}
