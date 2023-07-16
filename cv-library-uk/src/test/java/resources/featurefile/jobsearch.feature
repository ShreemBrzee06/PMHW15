Feature: Job Search Functionality


  Scenario Outline: User should be able to find the requested Job search page result using different dataset
    Given user is on home page
    When user enters job title in "<jobTitle>"
    And user enter location in "<location>"
    And user select distance in"<distance>"
    And user click on moreSearchOptionsLink
    And user enter minimum salary in "<salaryMin>"
    And user enter maximum salary in "<salaryMax>"
    And user select salary type in "<salaryType>"
    And user select jobType "<jobType>"
    Then user click on 'Find Jobs' button
    And user able to see the "<result>"

    Examples:
      | jobTitle               | location                           | distance | salaryMin | salaryMax | salaryType | jobType   | result                                                      |
      | Tester                 | Harrow, Greater London             | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow                             |
      | Software Test Engineer | Harrow on the Hill, Greater London | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Software Test Engineer jobs in Harrow on the Hill |
      | Test Engineer          | Stanmore, Greater London           | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Test Engineer jobs in Stanmore                    |
      | Test Analyst           | Borehamwood, Hertfordshire         | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Test Analyst jobs in Borehamwood                  |
      | Qa Engineer            | St Albans, Hertfordshire           | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Qa Engineer jobs in St Albans                     |
      | Automation Tester      | Watford, Hertfordshire             | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Automation Tester jobs in Watford                 |
