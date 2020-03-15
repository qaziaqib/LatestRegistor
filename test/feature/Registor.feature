Feature: Registor

  Scenario Outline: To test the registor functionality
    Given The registor page
    Then I will the neccessary detials like username "<FirstName>"
Then click on registor
    Examples: 
      | FirstName |
      | Aqib      |
