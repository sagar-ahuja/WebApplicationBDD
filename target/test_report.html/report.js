$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomeLoanCalculator.feature");
formatter.feature({
  "line": 2,
  "name": "How much a customer can borrow",
  "description": "",
  "id": "how-much-a-customer-can-borrow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Borrow"
    }
  ]
});
formatter.before({
  "duration": 18431706300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Borrowing estimate for a Single customer",
  "description": "",
  "id": "how-much-a-customer-can-borrow;borrowing-estimate-for-a-single-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already on the home loan borrow calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user fills the form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks the \"Work out how much I can borrow\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user gets an estimate borrowing amount",
  "keyword": "Then "
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_is_already_on_the_home_loan_borrow_calculator_page()"
});
formatter.result({
  "duration": 204209200,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_fills_the_form()"
});
formatter.result({
  "duration": 1713210100,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_clicks_the_Work_out_how_much_I_can_borrow_button()"
});
formatter.result({
  "duration": 368832500,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_gets_an_estimate_borrowing_amount()"
});
formatter.result({
  "duration": 3114712000,
  "status": "passed"
});
formatter.after({
  "duration": 3800988700,
  "status": "passed"
});
});