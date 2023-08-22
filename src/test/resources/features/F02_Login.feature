Feature: users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given User Go To home page
    When User Clicks on Login Button
    And User Enter Valid Email
    And User Enter Valid Password
    Then User Press on Login Button

  Scenario: User login with invalid email and password
    Given User in home page
    When User Enter on Login Button
    And User Enter InValid Email
    And User Enter InValid Password
    Then Press on Login Button