Feature: DarkSkyRegister feature

  Background:
    Given I am on home page

    @Register-1
    Scenario: Verify Register Button
      When I click on darkSkySignUpButton on home screen
      Then I verify that i am a valid register page
      And I click on darkSkyRegisterButton button on register page
      And I verify i am a valid register page