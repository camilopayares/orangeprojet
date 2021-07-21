Feature: ORANGE contact details page

  @P8
  Scenario: Update personal details page
    Given I am on the Orange Contact Details page
    When I click on Edit Contact Details button
    Then I can modify all the Contact Details information
      #Parametrisation
      | street1  				|    street2 			 | city       | province | zipcode | country | homephone   | mobile     | workphone  | email           | oemail             |
      | 3834 Sheerbroke |  2334 rue berri  |   montreal |    QC    | H4K1P2  | Canada	 | 5142733942  | 5142733941 | 5142733943 | dhd1@gmail.com  | dwsdwe22@gmail.com |