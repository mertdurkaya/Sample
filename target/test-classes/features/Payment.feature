@payment
Feature: Payment Test

  Background:
    Given Check login page elements
    Given Send valid username to username field
    When Send valid password to password field
    And Click submit button
    Then Check home page elements
    And Click "Yiyecek"
    Then Click add on random item
    And Click back button on category
    And Click "Süt & Kahvaltı"
    Then Click add on random item
    And Click back button on category
    And Click "Bebek"
    Then Click add on random item
    Then Click cart button
    And Check added items on cart page

  Scenario: Increasing the amount of items and Payment
    When Increase items in the cart one by one
    Then Check after added items on cart page
    And Click payment button
    And Check payment page elements
    And Click back
    And Remove added items on cart page
    And Check all items are removed from cart