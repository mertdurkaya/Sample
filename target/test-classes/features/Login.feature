@login
Feature: Login Tests

  Scenario: Successful Login
    Given Check login page elements
    Given Send valid username to username field
    When Send valid password to password field
    And Click submit button
    Then Check home page elements

  Scenario: Unsuccessful Login with invalid username
    Given Check login page elements
    Given Send invalid username to username field
    When Send valid password to password field
    And Click submit button
    Given Check login page elements

  Scenario: Unsuccessful Login with invalid password
    Given Check login page elements
    Given Send valid username to username field
    When Send invalid password to password field
    And Click submit button
    Given Check login page elements

  Scenario: Successful Logout
    Given Check login page elements
    Given Send valid username to username field
    When Send valid password to password field
    And Click submit button
    Then Check home page elements
    And Click profile button
    Then Click logout button
    And Check login page elements

  Scenario: Fail Scenario
    Given Check login page elements
    Given Send valid username to username field
    When Send valid password to password field
    And Click submit button
    Then Check home page elements
    Then Click logout button