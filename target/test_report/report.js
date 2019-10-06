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
  "duration": 20787589800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validating the message for $1 Living Expenses",
  "description": "",
  "id": "how-much-a-customer-can-borrow;validating-the-message-for-$1-living-expenses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@ThirdTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the form is empty",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enters amount as 1 in Living Expenses and leaving all other fields as 0",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks \u0027Work out how much I can borrow\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user should get the message as",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 23,
    "value": "Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions,\r\ncall us on 1800 100 641."
  }
});
formatter.match({
  "location": "BorrowingCapacitySteps.the_form_is_empty()"
});
formatter.result({
  "duration": 5477480100,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_enters_amount_as_1_in_Living_Expenses_and_leaving_all_other_fields_as_0()"
});
formatter.result({
  "duration": 1095937800,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_clicks_Work_out_how_much_I_can_borrow_button()"
});
formatter.result({
  "duration": 215785600,
  "status": "passed"
});
formatter.match({
  "location": "BorrowingCapacitySteps.user_should_get_the_message_as(String)"
});
formatter.result({
  "duration": 207223900,
  "status": "passed"
});
formatter.after({
  "duration": 3885458000,
  "status": "passed"
});
});