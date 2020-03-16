  @web


Feature: DarkSkyRegister feature

  Background:
  Given I am on the DarkSky Register page



     @Register-1
      Scenario: Verify invalid signup error message
       When I click on sign Up button
       And I click on register button
       Then I verify I am on register page by asserting Register header

