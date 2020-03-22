Feature: Registor
@OpenBrowser
  Scenario : open browser
    Given The registor page and open browser "<browserOpen>"
    
    
    
    @Registor
     Scenario Outline : To test the registor functionality
    Then I will the neccessary detials like username "<FirstName>" Email "<Email>" PhoneNo "<PhoneNo>"
Then click on registor
    Examples: 
      | FirstName       |browserOpen|Email       |PhoneNo|
     | AqibNafaza1       |   true    |qaz@gmail.com|9150003662|
      |  Irfanpatan      |   false   |iran@gmail.com|7006981745|