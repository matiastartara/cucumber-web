@AllSearch @All
Feature: Search product section

  @Search
  Scenario Outline: Search the product and assert that is displayed on the list

    Given user is on the home page
    When user enters a "<product>" in the search bar
    And the user click on search button
    Then the "<product>" is displayed on the list

    Examples:
      | product |
      | short   |

