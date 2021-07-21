package Steps;

import Actions.Common_actions;
import Actions.OrangeUpdateContactDetails_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeUpdateContactDetails_steps {
	Common_actions ca;
	OrangeLogin_steps orangeLogin_steps;
	OrangeDashboard_steps orangeDashboard_steps;
	OrangeUpdateContactDetails_actions orangeUpdateContactDetails_actions;
	
	
	public OrangeUpdateContactDetails_steps(Common_actions ca,
			OrangeLogin_steps orangeLogin_steps,
			OrangeDashboard_steps orangeDashboard_steps,
			OrangeUpdateContactDetails_actions orangeUpdateContactDetails_actions) {
			this.ca = ca;
			this.orangeLogin_steps = orangeLogin_steps;
			this.orangeDashboard_steps = orangeDashboard_steps;
			this.orangeUpdateContactDetails_actions = orangeUpdateContactDetails_actions;
	}
	
	@Given("I am on the Orange Contact Details page")
	public void i_am_on_the_orange_contact_details_page() throws Exception {
    	ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(4000);
	}
	
	@When("I click on Edit Contact Details button")
	public void i_click_on_edit_contact_details_button() throws Exception {
   	    orangeLogin_steps.i_enter_username_and_login_and_i_click_on_login_button();
   	    orangeDashboard_steps.i_click_on_my_info_link();
   	    orangeUpdateContactDetails_actions.clickContactDetailsButton();
		orangeUpdateContactDetails_actions.clickEditButton();
		Thread.sleep(4000);
    }
	
	@Then("I can modify all the Contact Details information")
	public void i_can_modify_all_the_contact_details_information(DataTable dataTable) throws Exception {
		orangeUpdateContactDetails_actions.deleteEmployeeContactStreet1();
		orangeUpdateContactDetails_actions.enterEmployeeContactStreet1(dataTable.cell(1,0));
		orangeUpdateContactDetails_actions.deleteEmployeeContactStreet2();
		orangeUpdateContactDetails_actions.enterEmployeeContactStreet2(dataTable.cell(1,1));
		orangeUpdateContactDetails_actions.deleteEmployeeContactCity();
		orangeUpdateContactDetails_actions.enterEmployeeContactCity(dataTable.cell(1,2));
		orangeUpdateContactDetails_actions.deleteEmployeeContactProvince();
		orangeUpdateContactDetails_actions.enterEmployeeContactProvince(dataTable.cell(1,3));
		orangeUpdateContactDetails_actions.deleteEmployeeZipCode();
		orangeUpdateContactDetails_actions.enterEmployeeZipCode(dataTable.cell(1,4));
		orangeUpdateContactDetails_actions.enterEmployeeCountry(dataTable.cell(1,5));
		orangeUpdateContactDetails_actions.deleteEmployeeHomeTelephone();
		orangeUpdateContactDetails_actions.enterEmployeeHomeTelephone(dataTable.cell(1,6));
		orangeUpdateContactDetails_actions.deleteEmployeeMobile();
		orangeUpdateContactDetails_actions.enterEmployeeMobile(dataTable.cell(1,7));
		orangeUpdateContactDetails_actions.deleteEmployeeWorkTelephone();
		orangeUpdateContactDetails_actions.enterEmployeeWorkTelephone(dataTable.cell(1,8));
		orangeUpdateContactDetails_actions.deleteEmployeeWorkEmail();
		orangeUpdateContactDetails_actions.enterEmployeeWorkEmail(dataTable.cell(1,9));
		orangeUpdateContactDetails_actions.deleteEmployeeOtherEmail();
		orangeUpdateContactDetails_actions.enterEmployeeOtherEmail(dataTable.cell(1,10));
		orangeUpdateContactDetails_actions.clickSaveButton();
		Thread.sleep(4000);
	}

}



//    #Parametrisation
//    | street1  		|    street2 	   | city       | province | zipcode | country   | homephone   | mobile     | workphone  | email           | oemail             |
//    | 3834 Sheerbroke |  2334 rue berri  |   montreal |    QC    | H4K1P2  | Canada	 | 5142733942  | 5142733941 | 5142733943 | dhd1@gmail.com  | dwsdwe22@gmail.com |

