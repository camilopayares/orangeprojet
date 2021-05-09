package Steps;

import static org.junit.Assert.fail;

import Actions.Common_actions;
import Actions.MyInfo_actions;
import Actions.OrangeDashboard_actions;
import Actions.OrangeEmergencyContacts_actions;
import Actions.OrangeLogin_actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeEmergencyContacts_steps {
	Common_actions ca;
	OrangeLogin_actions orangeLogin_actions;
	OrangeDashboard_actions orangeDashboard_actions;
	MyInfo_actions myInfo_actions;
	OrangeEmergencyContacts_actions orangeEmergencyContacts_actions;
	
	public OrangeEmergencyContacts_steps(Common_actions ca, OrangeLogin_actions orangeLogin_actions,
			OrangeDashboard_actions orangeDashboard_actions, MyInfo_actions myInfo_actions,
			OrangeEmergencyContacts_actions orangeEmergencyContacts_actions) {
		this.ca = ca;
		this.orangeLogin_actions = orangeLogin_actions;
		this.orangeDashboard_actions = orangeDashboard_actions;
		this.myInfo_actions = myInfo_actions;
		this.orangeEmergencyContacts_actions = orangeEmergencyContacts_actions;
	}

	@Given("I am on the Orange Emergency Contacts page")
	public void i_am_on_the_orange_emergency_contacts_page() throws InterruptedException {
		 ca.gotoUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 Thread.sleep(1000);
		 orangeLogin_actions.login();
		 Thread.sleep(2000);
		 orangeDashboard_actions.clickMyInfoLink();
		 Thread.sleep(1000);
		 myInfo_actions.clickEmergencyContactsLink();
		 Thread.sleep(1000);
		 if (!orangeEmergencyContacts_actions.assignedContactHeaderIsShown()) {
			 fail("Did not navigate to emergency contacts page");
		 }
	}
	
	// ----- Add a new emergency contact
	@When("I click on Add button")
	public void i_click_on_add_button() {
		orangeEmergencyContacts_actions.clickAddButton();
		
		if (!orangeEmergencyContacts_actions.addContactHeaderIsShown()) {
			fail("Did not shown emergency contact add controls");	
		}
	}
	
	@When("I enter {string} and {string} and {string} and {string} and {string}")
	public void i_enter_and_and_and_and(String name, String relationship, String home_telephone, String mobile, String work_telephone) {
		orangeEmergencyContacts_actions.enterName(name);
		orangeEmergencyContacts_actions.enterRelationship(relationship);
		orangeEmergencyContacts_actions.enterHomeTelephone(home_telephone);
		orangeEmergencyContacts_actions.enterMobile(mobile);
		orangeEmergencyContacts_actions.enterWorkTelephone(work_telephone);
	}
	
	@Then("I can add a new emergency contact")
	public void i_can_add_a_new_emergency_contact() throws InterruptedException {
		orangeEmergencyContacts_actions.clickSaveButton();
	    Thread.sleep(2000);
	    if (!orangeEmergencyContacts_actions.assignedContactHeaderIsShown()) {
			 fail("Did not navigate to emergency contacts page");
		}
	}
	// ------


	// ----- Edit an existing emergency contact
	@When("I click on a link with the {string} of the emergency contact on the list")
	public void i_click_on_a_link_with_the_name_of_the_emergency_contact_in_the_list(String name) throws InterruptedException {
		if (!orangeEmergencyContacts_actions.contactWithNameIsPresent(name)) {
			 fail("The contact with name " + name + " was not found");
		}
		orangeEmergencyContacts_actions.clickContactLink();
		Thread.sleep(1000);
		if (!orangeEmergencyContacts_actions.editContactHeaderIsShown()) {
			fail("Did not navigate to emergency contacts page");
		}
	}
	
	@When("I modify {string} and {string}")
	public void i_modify_and(String new_name, String new_relationship) {
		orangeEmergencyContacts_actions.enterName(new_name);
		orangeEmergencyContacts_actions.enterRelationship(new_relationship);
	}
	
	@Then("I can edit the emergency contact")
	public void i_can_edit_the_emergency_contact() throws InterruptedException {
		orangeEmergencyContacts_actions.clickSaveButton();
	    Thread.sleep(2000);
	    if (!orangeEmergencyContacts_actions.assignedContactHeaderIsShown()) {
			 fail("Did not navigate to emergency contacts page");
		}
	}
	
	@And("the contact name is changed from {string} to {string} on the list")
	public void the_contact_name_was_changed_from_to(String old_name, String new_name) throws InterruptedException {
		if (orangeEmergencyContacts_actions.contactWithNameIsPresent(old_name) || 
				!orangeEmergencyContacts_actions.contactWithNameIsPresent(new_name)) {
			 fail("The contact was not edited");
		}
	}
	// ------
	
	
	// ----- Delete existing emergency contact
	@When("I select the emergency contact on the list")
	public void i_select_the_emergency_contact_on_the_list() {
		orangeEmergencyContacts_actions.selectContactCheckbox();
	}
	
	@Then("I can delete the emergency contact")
	public void i_can_delete_the_emergency_contact() throws InterruptedException {
		orangeEmergencyContacts_actions.clickDeleteButton();
		Thread.sleep(2000);
	    if (!orangeEmergencyContacts_actions.assignedContactHeaderIsShown()) {
			 fail("Did not navigate to emergency contacts page");
		}
	}
	
	@And("the contact {string} is no longer on the list")
	public void the_contact_is_no_longer_on_the_list(String name) throws InterruptedException {
		if (orangeEmergencyContacts_actions.contactWithNameIsPresent(name)) {
			 fail("The contact was not deleted");
		}
	}
	// ------
}
