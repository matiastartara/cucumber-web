@All
Feature: Test login functionality

@Login
Scenario Outline: Login into the website with correct credentials
  Given user click on Sign in
  When user enter valid "<username>" and "<password>"
  Then welcome message is displayed

  Examples:
    | username      | password |
    | test@test.com | 12345    |
