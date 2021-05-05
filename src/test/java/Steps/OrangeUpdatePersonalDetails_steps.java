package Steps;

import Actions.Common_actions;
import Actions.OrangeLogin_actions;
import Actions.OrangeDashboard_actions;
import Actions.OrangeUpdatePersonalDetails_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeUpdatePersonalDetails_steps {
	Common_actions ca;
	OrangeLogin_actions orangeLogin_actions;
	OrangeDashboard_actions orangeDashboard_actions;
	OrangeUpdatePersonalDetails_actions orangeUpdatePersonalDetails_actions;
	
	
	public OrangeUpdatePersonalDetails_steps(Common_actions ca,
			OrangeLogin_actions orangeLogin_actions,
			OrangeDashboard_actions orangeDashboard_actions,
			OrangeUpdatePersonalDetails_actions orangeUpdatePersonalDetails_actions) {
			this.ca = ca;
			this.orangeLogin_actions = orangeLogin_actions;
			this.orangeDashboard_actions = orangeDashboard_actions;
			this.orangeUpdatePersonalDetails_actions = orangeUpdatePersonalDetails_actions;
	}
	
	@Given("I am on the Orange Personal Details page")
	public void i_am_on_the_orange_personal_details_page() throws Exception {
		 ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 Thread.sleep(4000);
	}
	@When("I click on Edit button")
	public void i_click_on_edit_button() throws Exception {
		orangeLogin_actions.enterUsername();
		orangeLogin_actions.enterPassword();
		orangeLogin_actions.clickLoginButton();
		orangeDashboard_actions.clickMyInfoLink();
		orangeUpdatePersonalDetails_actions.clickEditButton();
		Thread.sleep(8000);
	}
	@Then("I can modify all the personal Details information")
	public void i_can_modify_all_the_personal_details_information(DataTable dataTable) throws Exception {
		orangeUpdatePersonalDetails_actions.enterFirstName(dataTable.cell(1,0));
		orangeUpdatePersonalDetails_actions.enterMiddleName(dataTable.cell(1,1));
		orangeUpdatePersonalDetails_actions.enterLastName(dataTable.cell(1,2));
//		orangeUpdatePersonalDetails_actions.enterEmployeeId(dataTable.cell(1,3));
//		orangeUpdatePersonalDetails_actions.enterEmployeeOtherId(dataTable.cell(1,4));
//		orangeUpdatePersonalDetails_actions.enterLicenceNumber(dataTable.cell(1,5));
//		orangeUpdatePersonalDetails_actions.enterLicenceExpirationDate(dataTable.cell(1,6));
//		orangeUpdatePersonalDetails_actions.enterSSNNumber(dataTable.cell(1,7));
//		orangeUpdatePersonalDetails_actions.enterSINNumber(dataTable.cell(1,8));
//		orangeUpdatePersonalDetails_actions.clickMale(dataTable.cell(1,9));
//		orangeUpdatePersonalDetails_actions.clickFemale(dataTable.cell(1,10));
//		orangeUpdatePersonalDetails_actions.enterMaritalStatus(dataTable.cell(1,11));
//		orangeUpdatePersonalDetails_actions.enterNacionality(dataTable.cell(1,12));
//		orangeUpdatePersonalDetails_actions.enterDateOfBirthday(dataTable.cell(1,13));
//		orangeUpdatePersonalDetails_actions.enterNickName(dataTable.cell(1,14));
//		orangeUpdatePersonalDetails_actions.clickSmokeFlag(dataTable.cell(1,15));
//		orangeUpdatePersonalDetails_actions.enterMilitaryService(dataTable.cell(1,16));
		orangeUpdatePersonalDetails_actions.clickSaveButton();
		Thread.sleep(4000);
	}

//    #Parametrisation
//    | firstname | middlename | lastname | id  | otherid|liceno | licexpdate | ssnnumber | sinno |male		| female |maritalstatus | nationality | dob        | nickname | smoker|militaryservice |
//    | Jhon      | W          | Doe      | 123 |    345 |   678 |       912 |     345 	  |   678 | 1       | 0 	 |Single		|Canadian     | 1977-01-01 | alias    |    1  |  132213  	   |

}
