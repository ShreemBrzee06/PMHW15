Feature: Login Feature
  As a user want to check login functionality



@login
  Scenario: User should be able to  login successfully with valid credentials
    Given User is on Home page
    When I enter username "ganesha1@gmail.com"
    And I enter password "Test12345"
    And I click on login button
    And I saw message as "Accounts Overview"

  @Login
  Scenario Outline: user should not be able to login with invalid credentials
    Given User is on Home page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    And I saw error message "<error message>"

    Examples:

      | username           | password   | error message                                    |
      | ganeha@gmail.com   | Test_1234  | The username and password could not be verified. |
      | ganesha1@gmail.com | Test_12345 | The username and password could not be verified. |
      |                    | Test_12345 | Please enter a username and password.            |
      | ganesha@gmail.com  |            | Please enter a username and password.            |
      |                    |            | Please enter a username and password.            |
      | ganesha1@gmail.com | Test_12345 | The username and password could not be verified. |

    @Logout
    Scenario: user should be able to logout
      Given User is on Home page
      When I enter username "<ganesha1@gmail.com>"
      And I enter password "<Test12345>"
      And I click on login button
      Then I click on logout button
      And I saw log out message "Customer Login"