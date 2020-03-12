 @web

Feature: Gender feature

  Background:
    Given I am on home page

    @gender-1
    Scenario: Verify gender female is selected
      And I verify gender female is selected
      Then I click on create account button on home screen