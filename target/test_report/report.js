$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomeLoanCalculator.feature");
formatter.feature({
  "line": 1,
  "name": "How much a customer can borrow",
  "description": "",
  "id": "how-much-a-customer-can-borrow",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24573550200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Borrowing estimate for a Single customer",
  "description": "",
  "id": "how-much-a-customer-can-borrow;borrowing-estimate-for-a-single-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on the home loan borrow calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user fills the form",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the \"Work out how much I can borrow\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user gets an estimate borrowing amount",
  "keyword": "Then "
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_is_already_on_the_home_loan_borrow_calculator_page()"
});
formatter.result({
  "duration": 897645200,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_fills_the_form()"
});
formatter.result({
  "duration": 2371569600,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_clicks_the_Work_out_how_much_I_can_borrow_button()"
});
formatter.result({
  "duration": 154585900,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_gets_an_estimate_borrowing_amount()"
});
formatter.result({
  "duration": 2090559600,
  "status": "passed"
});
formatter.after({
  "duration": 2794265000,
  "status": "passed"
});
formatter.before({
  "duration": 17555191800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Clearing the form",
  "description": "",
  "id": "how-much-a-customer-can-borrow;clearing-the-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@SecondTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user has already calculated the borrowing capacity once",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks the \"start over\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "form gets cleared to default values",
  "keyword": "Then "
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_has_already_calculated_the_borrowing_capacity_once()"
});
formatter.result({
  "duration": 2300600500,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_clicks_the_start_over_button()"
});
formatter.result({
  "duration": 627608700,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.form_gets_cleared_to_default_values()"
});
formatter.result({
  "duration": 665191600,
  "status": "passed"
});
formatter.after({
  "duration": 2784245100,
  "status": "passed"
});
formatter.before({
  "duration": 18020320100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validating the message for $1 Living Expenses",
  "description": "",
  "id": "how-much-a-customer-can-borrow;validating-the-message-for-$1-living-expenses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@ThirdTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "the form is empty",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user enters amount as 1 in Living Expenses and leaving all other fields as 0",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user clicks \u0027Work out how much I can borrow\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user should get the message as",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 22,
    "value": "Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions,\r\ncall us on 1800 100 641."
  }
});
formatter.match({
  "location": "BorrowingCapacitySteps.the_form_is_empty()"
});
formatter.result({
  "duration": 1874493200,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_enters_amount_as_1_in_Living_Expenses_and_leaving_all_other_fields_as_0()"
});
formatter.result({
  "duration": 389984600,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_clicks_Work_out_how_much_I_can_borrow_button()"
});
formatter.result({
  "duration": 97993100,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_should_get_the_message_as(String)"
});
formatter.result({
  "duration": 75673800,
  "status": "passed"
});
formatter.after({
  "duration": 2795266500,
  "status": "passed"
});
});