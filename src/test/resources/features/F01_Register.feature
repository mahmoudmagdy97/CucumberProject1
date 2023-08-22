Feature: User Registration
  Scenario: guest user could register with valid data successfully
    Given User is in home page
    When User Clicks on Register Button
    And  User select gender type
    And User enter first name
    And User enter last name
    And User Select Day Of Birth
    And User Select Month Of Birth
    And User Select Years Of Birth
    And  User Enter Email
    And user Enter Password
    And User Enter Confirm Password
    Then User Clicks On Register