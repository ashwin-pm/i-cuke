Feature: Sample Poppinbit Feature

  @HelloWorld
  Scenario Outline: Testing Hello World
    Given "www.google.com" is launched
    When "<Title>" is entered in the search box
    And Search button is clicked
    Then Results should be displayed
    Examples:
      | Title    |
      | Rahpsody |