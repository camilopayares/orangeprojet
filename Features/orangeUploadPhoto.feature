Feature: ORANGE upload Photo

  @P88
  Scenario: Upload Photo in my Info page
    Given I am on my Personal Details page and I click on my Photo
    When I click on Browse and upload a new photo
    Then My Photo Profil is uploaded with success