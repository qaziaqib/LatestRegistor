Feature: Buyproduct 

  Scenario Outline: To Buy online product
   Given The registor page and open the browser "<browserOpen>" 
  Then I book a online product ProductOne "<ProductOne>" ProductTwo "<productTwo>" productThree "<productThree>" productdelete "<Deleteproduct>"
  Then fill information state "<State>"
  Examples:
  |browserOpen|ProductOne|productTwo|productThree|Deleteproduct|State|
  |true|Selenium Ruby|Thinking in HTML|Mastering JavaScript|Selenium Ruby|Andra Pradesh|

  