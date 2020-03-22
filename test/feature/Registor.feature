Feature: Registor
@OpenBrowser
  Scenario Outline: To test the registor functionality
    Given The registor page and open browser "<browserOpen>"
    Then I will the neccessary detials like username "<FirstName>" Email "<Email>" PhoneNo "<PhoneNo>"
Then click on registor
    Examples: 
      | FirstName       |browserOpen|Email       |PhoneNo|
     | AqibNafza1       |   true    |qaze@gmail.com|9159003662|
      |  Irfanatan      |   true   |iranb@gmail.com|7086981745|