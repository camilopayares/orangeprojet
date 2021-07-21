package Steps;

import Actions.Common_actions;
import Actions.OrangeUpdatePersonalDetails_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeUpdatePersonalDetails_steps {
	Common_actions ca;
	OrangeLogin_steps orangeLogin_steps;
	OrangeDashboard_steps orangeDashboard_steps;
	OrangeUpdatePersonalDetails_actions orangeUpdatePersonalDetails_actions;
	
	
	public OrangeUpdatePersonalDetails_steps(Common_actions ca,
			OrangeLogin_steps orangeLogin_steps,
			OrangeDashboard_steps orangeDashboard_steps,
			OrangeUpdatePersonalDetails_actions orangeUpdatePersonalDetails_actions) {
			this.ca = ca;
			this.orangeLogin_steps = orangeLogin_steps;
			this.orangeDashboard_steps = orangeDashboard_steps;
			this.orangeUpdatePersonalDetails_actions = orangeUpdatePersonalDetails_actions;
	}
	
	@Given("I am on the Orange Personal Details page")
	public void i_am_on_the_orange_personal_details_page() throws Exception {
		 ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 Thread.sleep(4000);
	}
	@When("I click on Edit button")
	public void i_click_on_edit_button() throws Exception {
		orangeLogin_steps.i_enter_username_and_login_and_i_click_on_login_button();
		orangeDashboard_steps.i_click_on_my_info_link();
		orangeUpdatePersonalDetails_actions.clickEditButton();
		Thread.sleep(4000);
	}
	@Then("I can modify all the personal Details information")
	public void i_can_modify_all_the_personal_details_information(DataTable dataTable) throws Exception {
		orangeUpdatePersonalDetails_actions.deleteEmployeeId();
		orangeUpdatePersonalDetails_actions.enterEmployeeId(dataTable.cell(1,0));
		orangeUpdatePersonalDetails_actions.enterSSNNumber(dataTable.cell(1,1));
		orangeUpdatePersonalDetails_actions.enterSINNumber(dataTable.cell(1,2));
		orangeUpdatePersonalDetails_actions.deleteLicenceNumber();
		orangeUpdatePersonalDetails_actions.enterLicenceNumber(dataTable.cell(1,3));
		orangeUpdatePersonalDetails_actions.deleteDateOfBirthday();
		orangeUpdatePersonalDetails_actions.enterDateOfBirthday(dataTable.cell(1,4));
		orangeUpdatePersonalDetails_actions.clickSaveButton();
		Thread.sleep(4000);
	}
}

//#Parametrisation
//| id  | ssnnumber | sinno | liceno | dob        |
//| 123 |       456 |   789 |    912 | 1977-01-01 |


