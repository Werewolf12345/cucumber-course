Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario Outline: Docs sections should contains appropriate columns
    Given user opens Cucumber website
    When user clicks on "Docs" section
    And user clicks on "<title>" item
    Then page with title "<title>" should appear
    Examples:
      | title          |
      | Gherkin Syntax |
      | Installation   |
