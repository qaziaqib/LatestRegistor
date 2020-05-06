Feature:Aglysis

   Scenario Outline: 
   Given login and click on submenu tshirts "<browserOpen>" email "<Email>" password "<password>" count "<count>"
  Then Select size "<Size>" color "<color>" and add to cart and count "<count>" and amount "<amount>"

  Examples:
 | browserOpen|Email|password|count|Size|color|amount|
 |true|qazicse@gmail.com|Admin@123|1|L|Blue|$16.51|
  