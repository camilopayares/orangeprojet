Feature:  ORANGE Emergency Contacts page

  @P4
  Scenario Outline: Add a new emergency contact
    Given I am on the Orange Emergency Contacts page
    When I click on Add button
    And I enter "<name>" and "<relationship>" and "<home_telephone>" and "<mobile>" and "<work_telephone>"
    Then I can add a new emergency contact
    Examples: 
      | name            | relationship | home_telephone  | mobile	    |	work_telephone |
     	|	John Smith	    | husband      | 4388564253      | 514789245  | 5146523894     |
     	|	Alice Belanger	| sister       | 5147854236      | 4387892145 | 4382365478     |
     	
     	
  @P5
  Scenario Outline: Edit an existing emergency contact
    Given I am on the Orange Emergency Contacts page
    When I click on a link with the "<name>" of the emergency contact on the list
    And I modify "<new_name>" and "<new_relationship>"
    Then I can edit the emergency contact
    And the contact name is changed from "<name>" to "<new_name>" on the list
  Examples: 
	  | name 					 | new_name          | new_relationship |
	  |	Alice Belanger | Alicia Belanger	 | mother           |
     	
     	
  @P6
  Scenario Outline: Delete an existing emergency contact
    Given I am on the Orange Emergency Contacts page
    When I select the emergency contact on the list
    Then I can delete the emergency contact
    And the contact "<name>" is no longer on the list
  Examples: 
	  | name              |
	  |	Alicia Belanger   |
	  | John Smith        |
