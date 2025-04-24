Feature: Login functionality

  Scenario: Successful login
    Given user opens the login page
    When user enters valid credentials
    Then user is logged in
