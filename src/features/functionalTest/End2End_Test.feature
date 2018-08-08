Feature: Auomated E2E

Scenario: Placing order
  Given user is on home page
  When he search for "dresses"
  And chose to bye the first item
  And move to checkout from mini cart
  And enter "customer" personal details on checkout page
  And select some deleivry address
  And select payment method as "check"
  And place order

