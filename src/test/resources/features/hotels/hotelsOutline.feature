@web
  Feature: Search feature


Background:
  Given  I am on Hotels HomePage


@Hotels-1
Scenario Outline: Verify user can only view the result by selected property class
  When I enter destination
  And I navigate to search result page
  And I select property class <stars> stars
  Then I verify system displays only <stars> stars hotels on search result


  Examples:
    |stars    |
    | 5       |
    | 4       |
    | 3       |


  @Hotels-3
  Scenario: Verify todays deal price value
    When I enter destination
    And I navigate to search result page
    Then I verify todays deal is less than $200


    @Hotels-2
    Scenario: List of all of hotel within 10 miles radius of airport or downtown
      Then I verify system displays all hotels within 10 miles radius of airport
      And I verify Hilton Hotel is within radius







    @Hotels-4
    Scenario Outline: Verify room count dropdown

      Then I select <select_rooms> from room dropdown
      And I verify <number_of_room_dropdown> is displayed
      Examples:
      |select_rooms | number_of_room_dropdown|
      |1            | 1                      |
      |2            | 2                      |
      |3            | 3                      |
      |4            | 4                      |
      |5            | 5                      |
      |6            | 6                      |
      |7            | 7                      |
      |8            | 8                      |
      |9+           | 0                      |






