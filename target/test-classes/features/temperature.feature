@Web
  Feature: DarkSky Temperature Feature
    Background:
    Given I am on DarkSky Home Page




    @Temperature-1
      Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
      Then I verify current temp is not greater or less then temps from daily timeline




    @Temperature-2
    Scenario: Verify individual day temp timeline
      When I expand todays timeline
      Then I verify lowest and highest temp is displayed correctly



      @Temperature-3
      Scenario: Verify individual day temp timeline
        When I expand todays timeline
        Then I verify lowest and highest temp is displayed correctly







