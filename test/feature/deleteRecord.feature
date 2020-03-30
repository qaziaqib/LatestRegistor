Feature: Delete

  Scenario Outline: To test delete functionality
   Given The registor page and open Browser "<browserOpen>"
 
  Then I delete the record email "<Email>".
  Examples:
  |browserOpen|Email|
  |true|qazde@gmail.com|
  |false|ina@gmail.com|
  