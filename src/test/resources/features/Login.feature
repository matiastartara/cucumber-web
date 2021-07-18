@All
Feature: Test login functionality

@Login
  Scenario Outline: Login into the website with incorrect credentials
    Given user click on Sign in
    When user enter invalid "<email>" and "<password>"
    Then error message is displayed

    Examples:
      | email         | password |
      | test@test.com | 12345    |
