Feature: ORANGE login page

  @P1
  Scenario: Login page
    Given I am on the Login page
    When I enter username and login and I click on Edit button
    Then I can see the Dashboard Page