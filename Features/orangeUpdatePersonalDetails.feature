Feature: ORANGE personal details page

  @P7
  Scenario: Update personal details page
    Given I am on the Orange Personal Details page
    When I click on Edit button
    Then I can modify all the personal Details information
      #Parametrisation
      | id  | ssnnumber | sinno | liceno | dob        |
      | 123 |       456 |   789 |    912 | 1977-01-01 |
