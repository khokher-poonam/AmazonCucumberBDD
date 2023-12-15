Feature:CucumberBDD
  Background:
    Given open the browser
  Scenario: Checking Login functionality of Amazon
    When open the Amazon url
    And verify the Homepage Title
    Then user click on signin button
    Then user click on create amazon account
    Then verify amazon registration page
    And user enter all registration details
    Then back to homepage

