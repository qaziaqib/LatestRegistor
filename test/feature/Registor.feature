Feature: Registor
@OpenBrowser
  Scenario Outline: To test the registor functionality
    Given The registor page and open browser "<browserOpen>"
    Then I will the neccessary detials like username "<FirstName>" Email "<Email>" PhoneNo "<PhoneNo>"
Then click on registor
    Examples: 
      | FirstName       |browserOpen|Email       |PhoneNo|
     | Aqiazt       |   true    |qazde@gmail.com|6958203662|
      |  Iatan      |   false   |ina@gmail.com|9709981745|