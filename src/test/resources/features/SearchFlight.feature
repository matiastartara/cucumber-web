@AllSearch @All
Feature: Search flight

  @Search
  Scenario Outline: Search for a flight with no seats available
    Given user is on the home page
    When user go to flights section
    And the user search for a flight from "<departingFrom>" to "<arrivingIn>"
    Then the system returns no seats available

    Examples:
      | departingFrom | arrivingIn |
      | Acapulco      | London     |