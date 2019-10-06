package demo.webapp.stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;

//import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.webapp.pages.BorrowingCapacity;
import demo.webapp.util.TestBase;

public class BorrowingCapacitySteps extends TestBase {
	BorrowingCapacity bcap;
	
	@Before
	public void setUp() {
		TestBase.intitialisation();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		TestBase.driver.quit();
	}
	
	@Given("^user is already on the home loan borrow calculator page$")
	public void user_is_already_on_the_home_loan_borrow_calculator_page() {
		bcap = new BorrowingCapacity();
	}

	@When("^user fills the form$")
	public void user_fills_the_form() {
		bcap.inputValuesForSingleCustomer(prop.getProperty("dependants"), prop.getProperty("income"), prop.getProperty("otherIncome"), prop.getProperty("livingExpenses"), prop.getProperty("otherLoanRepayments"), prop.getProperty("creditCardLimit"));
	}

	@Then("^user clicks the \"Work out how much I can borrow\" button$")
	public void user_clicks_the_Work_out_how_much_I_can_borrow_button(){
		bcap.calculateBorrowingCapacity();
	}

	@Then("^user gets an estimate borrowing amount$")
	public void user_gets_an_estimate_borrowing_amount() throws InterruptedException {
		
		String actual = bcap.validateBorrowingEstimate();
		//Assert.assertEquals("$479,000", actual);
		if(actual.equals(prop.getProperty("expectedBorrowingEstimate"))) {
			System.out.println("Borrowing estimate: "+actual+" matches the expected value of "+prop.getProperty("expectedBorrowingEstimate"));
		}else
			System.out.println("Borrowing estimate: "+actual+" doesn't match the expected value of "+prop.getProperty("expectedBorrowingEstimate"));
	}

	
	@Given("^user has already calculated the borrowing capacity once$")
	public void user_has_already_calculated_the_borrowing_capacity_once() {
		bcap = new BorrowingCapacity();
		bcap.inputValuesForSingleCustomer(prop.getProperty("dependants"), prop.getProperty("income"), prop.getProperty("otherIncome"), prop.getProperty("livingExpenses"), prop.getProperty("otherLoanRepayments"), prop.getProperty("creditCardLimit"));
		bcap.calculateBorrowingCapacity();
	}

	@When("^user clicks the \"start over\" button$")
	public void user_clicks_the_start_over_button() {
		bcap.clickStartOverBtn();
	}

	@Then("^form gets cleared to default values$")
	public void form_gets_cleared_to_default_values() throws Exception {
		bcap.checkDefaultValues();
	}

	@Given("^the form is empty$")
	public void the_form_is_empty() {
		bcap = new BorrowingCapacity();
		bcap.clearForm();
	}

	@When("^user enters amount as 1 in Living Expenses and leaving all other fields as 0$")
	public void user_enters_amount_as_1_in_Living_Expenses_and_leaving_all_other_fields_as_0() {
		bcap.enter$1InLivingExpense();
	}

	@Then("^user clicks 'Work out how much I can borrow' button$")
	public void user_clicks_Work_out_how_much_I_can_borrow_button() {
		bcap.calculateBorrowingCapacity();
	}

	@Then("^user should get the message as$")
	public boolean user_should_get_the_message_as(String arg1) {
		 return bcap.validateErrorMessage();
	    
	}



}
