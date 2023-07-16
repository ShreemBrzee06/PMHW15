Feature: Home Page for Amazon website

  As a user check that in homepage all the provided link navigate to new page

  Scenario: as user check that pages get navigated successfully on home page
    Given user is on HomePage
    When user clicks on signIn link
    Then verifies the text signin Link
