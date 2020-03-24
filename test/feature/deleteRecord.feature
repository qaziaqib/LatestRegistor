Feature: Delete

  Scenario Outline: To test delete functionality
   Given The registor page and open Browser "<browserOpen>"
  Given I click Edit button and make changes
  Then I delete the record.
  Examples:
  |browserOpen|
  |true|
  