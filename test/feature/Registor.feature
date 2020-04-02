Feature: registor and delete
@OpenBrowser
  Scenario Outline: To test the registor functionality
    Given The registor page and open browser "<browserOpen>"
    Then I will the neccessary detials like username "<FirstName>" Email "<Email>" PhoneNo "<PhoneNo>"
Then click on registor and Check Email "<Email>"
    Examples: 
      | FirstName       |browserOpen|Email          |PhoneNo|
      | Aqiazt          |   true    |qazde@gmail.com|6958203662|
      |  Iatan          |   false   |ina@gmail.com   |9709981745|
      
       Scenario Outline: To test delete functionality
   Given The registor page and open Browser "<browserOpen>"
 
  Then I delete the record email "<Email>".
  Examples:
  |browserOpen|Email|
  |true|qazde@gmail.com|
  |false|ina@gmail.com|