Feature: Account Functionality
  As a user, I should be able to see my Account after login to parabank website

  Scenario:
    Given I am on HomePage
    And I enter username "ganesha1@gmail.com"
    And I enter password "Test12345"
    Then I click on login button
    And I should be able to see the text message displayed as "Accounts Overview"