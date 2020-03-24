Feature: Registor
@OpenBrowser
  Scenario Outline: To test the registor functionality
    Then The registor page and open browser "<browserOpen>"
    Then I will the neccessary detials like username "<FirstName>" Email "<Email>" PhoneNo "<PhoneNo>"
Then click on registor
    Examples: 
      | FirstName       |browserOpen|Email       |PhoneNo|
     | AqibNafzat       |   true    |qazie@gmail.com|9158003662|
      |  Irfnatan      |   false   |irab@gmail.com|7089981745|