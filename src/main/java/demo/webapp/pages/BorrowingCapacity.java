package demo.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import demo.webapp.util.TestBase;


public class BorrowingCapacity extends TestBase{
	
	/* declare the object repositories */
	@FindBy (xpath = "//input[@id = 'application_type_single']")
	WebElement single_rb;
	
	@FindBy (xpath = "//input[@id = 'application_type_joint']")
	WebElement joint_rb;
	
	@FindBy (xpath = "//select[@title = 'Number of dependants']")
	WebElement dependants_dropdown;
	
	@FindBy (xpath = "//input[@id = 'borrow_type_home']")
	WebElement borrowHome_rb;
	
	@FindBy (xpath = "//input[@id = 'borrow_type_investment']")
	WebElement borrowInvestment_rb;
	
	@FindBy (xpath = "//label[contains(text(), 'Your income (before tax)')]/following-sibling::div/input")
	WebElement income_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Your other income')]/following-sibling::div/input")
	WebElement otherIncome_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Living expenses')]/following-sibling::div/input")
	WebElement livingExpenses_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Current home loan repayments')]/following-sibling::div/input")
	WebElement homeLoanRepayments_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Other loan repayments')]/following-sibling::div/input")
	WebElement otherLoanRepayments_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Other commitments')]/following-sibling::div/input")
	WebElement otherCommitments_textbox;
	
	@FindBy (xpath = "//label[contains(text(), 'Total credit card limits')]/following-sibling::div/input")
	WebElement creditCardLimits_textbox;
	
	@FindBy (xpath = "//button[contains(text(), 'Work out how much I could borrow')]")
	WebElement borrow_btn;
	
	@FindBy (xpath = "//span[@class = 'borrow__result__text']/parent::div/following-sibling::div/button")
	WebElement startOver_btn;
	
	@FindBy (xpath = "//span[@class = 'borrow__error__text']/parent::div/following-sibling::div/button")
	WebElement startOver_borrowError_btn;
	
	@FindBy (xpath = "//span[@class = 'borrow__result__text__amount']")
	WebElement borrowResult;
	
	@FindBy (xpath = "//span[@class = 'borrow__error__text']")
	WebElement errorMsg;
	
	String errorMessage = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions,\r\n" + 
			"call us on 1800 100 641.";
	
	
	// initialize the page factory
	public BorrowingCapacity() {
		PageFactory.initElements(driver,  this);
	}
	
	// write methods	
	public void inputValuesForSingleCustomer(String txt, String income, String otherIncome, String expenses, String otherLoan, String ccLimits) {
		Select dependants = new Select(dependants_dropdown);
		dependants.selectByVisibleText(txt);
		
		single_rb.click();
		borrowHome_rb.click();
		
		income_textbox.sendKeys(income);
		otherIncome_textbox.sendKeys(otherIncome);
		livingExpenses_textbox.sendKeys(expenses);
		otherLoanRepayments_textbox.sendKeys(otherLoan);
		creditCardLimits_textbox.sendKeys(ccLimits);
			
	}
	
	public void calculateBorrowingCapacity() {
		borrow_btn.click();
	}
		
	public String validateBorrowingEstimate() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'borrow__result__text__amount']")));
		Thread.sleep(2000);
		String result = borrowResult.getText();
		return result;		
	}
	
	public void clickStartOverBtn() {
		if(borrowResult.isDisplayed()) {
			startOver_btn.click();
		}
		if(errorMsg.isDisplayed()) {
			startOver_borrowError_btn.click();
		}
	}
	
	public void clearForm() {
		Select dependants = new Select(dependants_dropdown);
		dependants.selectByVisibleText("0");
		
		single_rb.click();
		borrowHome_rb.click();
		otherIncome_textbox.clear();
		livingExpenses_textbox.clear();
		homeLoanRepayments_textbox.clear();
		otherLoanRepayments_textbox.clear();
		otherCommitments_textbox.clear();
		creditCardLimits_textbox.clear();
		creditCardLimits_textbox.clear();
		
	}
	
	public void checkDefaultValues() throws Exception {
		if(single_rb.isSelected())
			System.out.println("Application Type value is defaulted to 'Single'");
		else
			throw new Exception();
		
		Select dep = new Select(dependants_dropdown);
		if(dep.getFirstSelectedOption().isSelected())
			System.out.println("Number of dependants value is defaulted to '0'");
		else
			throw new Exception();
		
		if(borrowHome_rb.isSelected())
			System.out.println("Property you would like to buy value is defaulted to 'Home to live in'");
		else
			throw new Exception();
		
		if(livingExpenses_textbox.getAttribute("value").contentEquals("0"))
			System.out.println("Living expenses value is defaulted to '0'");
		else
			throw new Exception();
		
		if(homeLoanRepayments_textbox.getAttribute("value").contentEquals("0"))
			System.out.println("Current home loan repayments value is defaulted to '0'");
		else
			throw new Exception();
		
		if(otherLoanRepayments_textbox.getAttribute("value").contentEquals("0"))
			System.out.println("Other loan repayments value is defaulted to '0'");
		else
			throw new Exception();
		
		if(otherCommitments_textbox.getAttribute("value").contentEquals("0"))
			System.out.println("Other commitments value is defaulted to '0'");
		else
			throw new Exception();
		
		if(creditCardLimits_textbox.getAttribute("value").contentEquals("0"))
			System.out.println("Total credit card limits value is defaulted to '0'");
		else
			throw new Exception();
		
		if(borrow_btn.isDisplayed())
			System.out.println("'Work out how much I could borrow' button is visible");
		else
			throw new Exception();
	}
	
	public void enter$1InLivingExpense() {
		livingExpenses_textbox.sendKeys("1");
	}
	
	public boolean validateErrorMessage() {
		if(errorMsg.getText().equals(errorMessage)) {
			return true;
		}else
			return false;
	}

}
