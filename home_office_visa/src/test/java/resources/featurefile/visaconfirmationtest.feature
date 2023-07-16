Feature: Visa confirmation Test
  As a user I should be able to get visa confirmation status

@Australian
  Scenario: User should be able to get visa confirmation status for Australian
    Given User should be on HomePage and Clicked on cookies
    When User click on Start Button
    And user select nationality as "Australia"
    And user click on continue button
    And user click on reason for visit as Tourism or visiting family and friends
    And click on continue button
    Then it shows the result message as "You will not need a visa to come to the UK"

    @Chilean
    Scenario: User coming to UK as Chilean for work and plans on staying for longer than six months
      Given User should be on HomePage and Clicked on cookies
      When User click on Start Button
      And user select nationality as "Chile"
      And user click on continue button
      And user click on reason for visit as Work, academic visit or business
      And user click on continue button
      And user select the intendent stay for "longer than 6 months"
      And user click on next continue button
      And user Select have planning to work for Health and care professional
      And user click on Continue button
      Then user should get result message as "You need a visa to work in health and care"

      @Cambodia
      Scenario: User coming to UK as a Cambodian to join a partner for a long stay
        Given User should be on HomePage and Clicked on cookies
        When User click on Start Button
        And user select nationality as "Cambodia"
        And user click on continue button
        And user click on reason for visit as Join partner or family for a long stay
        And user click on continue button
        And user select family immigration status "Yes"
        And user click on Continue button
        Then user should get result message as "You’ll need a visa to join your family or partner in the UK"




