Feature: Delete

  Scenario Outline: To test delete functionality
   Given The registor page and open Browser "<browserOpen>"
 
  Then I delete the record.
  Examples:
  |browserOpen|
  |true|
  