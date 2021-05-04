Feature: ORANGE personal details page

  @P7
  Scenario: Update personal details page
    Given I am on the Orange Personal Details page
    When I click on Edit button
    Then I can modify all the personal Details information
      #Parametrisation
      | firstname | middlename | lastname | id  | liceno | licexpdate | ssnnumber | otherid | sinno | maritalstatus | nationality | dob        | nickname | militaryservice | bloodtype | licexpdate | attdesc |
      | Jhon      | W          | Doe      | 123 |    345 |        678 |       912 |     345 |   678 | Married       | Canadian    | 1977-01-01 | alias    |          132213 | a+        |       1213 | na      |
