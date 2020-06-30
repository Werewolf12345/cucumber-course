Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: Docs sections should contains appropriate columns
    Given user opens Cucumber website
    When user clicks on "Docs" section
    And user clicks on "Gherkin Syntax" item
    Then page with title "Gherkin Syntax" should appear
