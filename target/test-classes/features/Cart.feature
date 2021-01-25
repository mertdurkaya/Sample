@cart
Feature: Cart Test

  Background:
    Given Check login page elements
    Given Send valid username to username field
    When Send valid password to password field
    And Click submit button
    Then Check home page elements

  Scenario: Add item to cart
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
    Then Remove added items on cart page
    And Check all items are removed from cart