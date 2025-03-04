Feature: Title of your feature

  Scenario: postmethod using API
    Given I am having the post API
      """
           {
      
               "name":"Learn Appium Automation with Java",
               "isbn":"bcd",
               "aisle":"227",
               "author":"John foe"
      """
    When I am hitting the post method
    Then I verify the api result

  Scenario: postmethod using API
    Given I am having the post API
      """
           {
      
               "name":"Learn Appium Automation with Java",
               "isbn":"bcd",
               "aisle":"227",
               "author":"John foe"
      """
    When I am hitting the post method
    Then I verify the api result
