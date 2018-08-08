$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Auomated E2E",
  "description": "",
  "id": "auomated-e2e",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16117115136,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Placing order",
  "description": "",
  "id": "auomated-e2e;placing-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he search for \"dresses\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "chose to bye the first item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "move to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter \"customer\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select some deleivry address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select payment method as \"check\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "place order",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13957731735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dresses",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.he_search_for(String)"
});
formatter.result({
  "duration": 13574931542,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 17139248157,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 23374920016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "customer",
      "offset": 7
    }
  ],
  "location": "CheckoutPageSteps.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 35590835579,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.select_same_delivery_address()"
});
formatter.result({
  "duration": 8175672705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 26
    }
  ],
  "location": "CheckoutPageSteps.select_payment_method_as_payment(String)"
});
formatter.result({
  "duration": 13119997127,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.place_the_order()"
});
formatter.result({
  "duration": 5182837613,
  "status": "passed"
});
formatter.after({
  "duration": 4154565612,
  "status": "passed"
});
});