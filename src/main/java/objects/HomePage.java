package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.google.inject.PrivateBinder;

import common.Commons;

public class HomePage {
	Commons commons;

	public HomePage(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}

	@FindBy(xpath = "//a[@class='header-link -login']")
	WebElement loginElement;

	@FindBy(xpath = "//a[text()='Enroll in M&T Online Banking']")
	WebElement enrollElement;

	@FindBy(xpath = "(//span[@class='button m-icon m-icon-arrowright' and @aria-hidden='true']) [1]")
	WebElement persElement;

	@FindBy(xpath = "//button[@data-ensightentag='ContinueButton']")
	WebElement continuElement;

	@FindBy(xpath = "//input[@class='input-group-field js-canShowHide js-formnputItem input-group__hide-button-on-focus js-keeponclear']")
	WebElement acNumElement;
	
	@FindBy(xpath = "//input[@placeholder='000-00-0000']")
	WebElement ssnElement;
	
	@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
	WebElement dobElement;
	
	@FindBy(xpath = "//button[@class='button button__form js-submit']")
	WebElement continueButtonElement;
	
	@FindBy(xpath = "//a[@class='footer-search']")
	WebElement searchElement;
	
	@FindBy(xpath = "//input[@class='search-results-input animateInput']")
	WebElement searchvaluElement;
	
	@FindBy(className = "search-results-icon-magnifying-glass-image")
	WebElement searchvaluclickWebElement;
	
	@FindBy(xpath = "//a[@href='https://www3.mtb.com/personal/personal-banking/checking-accounts-mandt-bank/how-to-manage-your-checking-account']")
	WebElement manageClickElement;
	
	@FindBy(xpath = "//a[@href='/personal/personal-banking/checking-accounts-mandt-bank/how-to-manage-your-checking-account/how-to-make-a-bank-account-deposit']")
	WebElement manageDepositElement;


	
	
//	@FindBy(id = "AccountNumber")
//	WebElement debitcardElement;
//	
//	@FindBy(xpath = "//a[@aria-label='Display Commercial Treasury Center Login Form']")
//	WebElement commerCialClickElement;
//	
//@FindBy(xpath = "//input[@id='loginId']")
//WebElement userIdElement;
//
//@FindBy(xpath = " //input[@value='Log In >'][1]")
//WebElement logInElement2;


	private void clickLogin() {
		commons.click(loginElement);
	}

	private void clickEnrollment() {
		commons.click(enrollElement);
	}

	private void clickPersonal() {
		commons.click(persElement);
	}


	private void acNum(String acNu) {
		commons.inputValues(acNumElement, acNu);
	}
	private void ssnNum(String ssnNu) {
		commons.inputValues(ssnElement, ssnNu);
		
	}
	private void dob(String dob) {
		commons.inputValues(dobElement, dob);
	}
	private void continueButton() {
		commons.click(continueButtonElement);
	}
	private void serachClick() {
		commons.click(searchElement);
	}
private void serachValue(String putValue) {
	commons.inputValues(searchvaluElement, putValue);	}

private void serachvalueClick() {
	commons.click(searchvaluclickWebElement);
}
private void manageClick() {
	commons.click(manageClickElement);
}
private void manageDeposit() {
	commons.click(manageDepositElement);
}
//	


//	private void debitCard(String value) {
//		commons.inputValues(debitcardElement, value);
//
//	}
//	private void userId(String user) {
//		commons.inputValues(userIdElement, user);	
//	}
//	private void commercialClick() {
//		commons.click(commerCialClickElement);
//		
//	}
//	private void logInClick() {
//		commons.click(logInElement2);
//	}

	
	

	public void homepageSteps(String acnum, String ssn, String dob) {
		clickLogin();
		clickEnrollment();
		clickPersonal();
		acNum(acnum);
		ssnNum(ssn);
		dob(dob);
		continueButton();

	}
	public void searchsteps(String putValue) {
		serachClick();
		serachValue(putValue);
		serachvalueClick();
		manageClick();
		manageDeposit();
		
	}
	
//	public void userIdSteps(String userI) {
//		clickLogin();
//		commercialClick();
//		userId(userI);
//		logInClick();
//		
//		
//		
//	}
//	
	

}
