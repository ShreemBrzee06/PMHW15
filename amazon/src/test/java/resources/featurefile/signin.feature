Feature: Sign in functionality

  Scenario Outline: As a user check the Sign in functionality using invalid credential
    Given user is on HomePage
    When user clicks on signIn link
    And user enters "<email>"in emailfield
    And click on Continue button
    And enters "<Password>" in passwordField.
    And click on signin button after password
    Then verifies the "<error message>"

    Examples:
      | email          | Password   | error message              |
      | test@gmail.com | test_12345 | Your password is incorrect |