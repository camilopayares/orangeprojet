Feature: ORANGE personal details page

  @P7
  Scenario: Update personal details page
    Given I am on the Orange Personal Details page
    When I click on Edit button
    Then I can modify all the personal Details information
      #Parametrisation
      | firstname | middlename | lastname |
      | Jhon      | W          | Doe      |
     # id  | otherid | liceno | licexpdate | ssnnumber | sinno | male | female | maritalstatus | nationality | dob        | nickname | smoker | militaryservice |
     #  | 123 |     345 |    678 |        912 |       345 |   678 |    1 |      0 | Single        | Canadian    | 1977-01-01 | alias    |      1 |          132213 |
