Feature: DarkSkyRegister feature

  Background: I am on dark sky page


     @Register-1
      Scenario: Verify invalid signup error message
       When I am on darksky Register Page
       Then I click on register button
       Then I verify I am on register page by asserting Register header

