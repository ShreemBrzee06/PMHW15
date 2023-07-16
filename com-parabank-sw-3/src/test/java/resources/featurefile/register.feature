Feature: RegisterPage Functionality
  @RegisterLink
  Scenario: user should be able to click on register link and see display text message
    Given  I click on the Register link
    And I should be able to see the text message displayed as "Signing up is easy!"

  @Registration
  Scenario: User should be able to register by using registerLink available on HomePage
    Given I click on the Register link
    And I entered First name as "Ganesha"
    And I entered Last name as "Shiv"
    And I Entered Address "Test"
    And I entered City as"Test City"
    And I entered State as "Test State"
    And I entered Zip Code as "TT14 56DD"
    And I entered Phone as "0125422525"
    And I entered SSN as "152457841"
    And I entered username as "ganesha1@gmail.com"
    And I entered password as "Test12345"
    And I enteted confirm password as"Test12345"
    Then I click on register button
    And I saw message as "Your account was created successfully. You are now logged in."

