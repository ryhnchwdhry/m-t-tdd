package objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Commons;

public class BusinessAc {
	Commons commons;

	public BusinessAc(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}
	
	
	@FindBy(xpath = "//a[@href='/business' and @data-speedbump-enabled='false']")
	WebElement businessElementClickElement;
	
	@FindBy(xpath = "//a[@aria-label='Get business banking recommendations tailored to you']")
	WebElement getStartedClickElement;
	
	@FindBy(xpath = "//a[@aria-label='Open A simple checking account online']")
	WebElement openOnlineClickElement;
	
	@FindBy(xpath = "//span[text()=' Yes ']")
	WebElement yesClickElement;
	
	@FindBy(xpath = "//button[@data-cy='ownership-percentage-submit-button']")
	WebElement countinueClickElement;
	
	@FindBy(xpath = "//span[text()='Okay, I got it']")
	WebElement okayClickElement;
	
	@FindBy(xpath = "//button[@data-cy='apply-now-button']")
	WebElement applyClickElement;
	
	@FindBy(xpath = "//input[@data-cy='first-name-input']")
	WebElement firstNamElement;
	
	@FindBy(xpath = "//input[@data-cy='last-name-input']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c132-8 ng-star-inserted']")
	WebElement suffixElement;
	
	@FindBy(xpath = "//span[text()=' Sr ']")
	WebElement srClickElement;
	
	@FindBy(xpath = "//input[@formcontrolname='ssn']")
	WebElement ssnElement;
	
	@FindBy(xpath = "//input[@formcontrolname='dob']")
	WebElement dobElement;
	
	@FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c132-12 ng-star-inserted']")
	WebElement citizenShipElement;
	
	@FindBy(xpath = "//span[text()=' Resident Alien ']")
	WebElement nonResidentElement;
	
	@FindBy(xpath = "//input[@data-cy='additional-citizenship-countries-input']")
	WebElement countryElement;
	
	@FindBy(xpath = "//span[text()=' Bangladesh ']")
	WebElement bangladeshElement;
	
	@FindBy(xpath = "//input[@data-cy='primaryAddress1-input']")
	WebElement adressElement;
	
	@FindBy(xpath = "//input[@data-cy='primaryAddressCity-input']")
	WebElement cityElement;
	
	@FindBy(xpath = "//input[@aria-label='Primary Address State']")
	WebElement statElement;
	
	@FindBy(xpath = "//SPAN[text()=' New York ']")
	WebElement nYElement;
	
	@FindBy(xpath = "//input[@data-cy='primaryAddressPostalCode-input']")
	WebElement zipCodElement;
	
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement checkBoxElement;
	
	@FindBy(xpath = "//span[text()='Continue']")
	WebElement countinuElement;
	
	
	
	private void businessClick() {
		commons.click(businessElementClickElement);
	}
	private void getStartedClick() {
		commons.click(getStartedClickElement);
	}
	private void openOnlineClick() {
		commons.click(openOnlineClickElement);
	}
	private void yesClick() {
		commons.click(yesClickElement);
	}
	private void countinueClick() {
		commons.click(countinueClickElement);
	}
	
	private void okayClick() {
		commons.click(okayClickElement);
	}
	private void applyClick() {
		commons.click(applyClickElement);
	}
	private void firstName(String firstName) {
		commons.inputValues(firstNamElement, firstName);
	}
	private void lastName(String lastName) {
		commons.inputValues(lastNamElement, lastName);
	}
	private void suffixClick() {
		commons.click(suffixElement);
	}
	
	private void srClick() {
		commons.click(srClickElement);
	}
	
	private void ssn(String ssn) {
		commons.inputValues( ssnElement, ssn);
	}
	
	private void dob(String dob) {
		commons.inputValues( dobElement, dob);
	}
	
	private void citizenShipClick() {
		commons.click(citizenShipElement);
	}
	private void ResidentClick() {
		commons.click(nonResidentElement);
	}
	private void country(String country) {
		commons.inputValues( countryElement, country);
	}
	
	private void banglaDeshClick() {
		commons.click(bangladeshElement);
	}
	
	private void adress(String adress) {
		commons.inputValues( adressElement, adress);
	}
	private void  city(String  city) {
		commons.inputValues(  cityElement, city);
	}
	
	private void state(String state) {
		commons.inputValues(statElement, state);
	}
	
	private void nY() {
		commons.click(nYElement);
	}
	private void zipCodE(String zipCode) {
		commons.inputValues(zipCodElement, zipCode);
	}
	private void checkBox() {
		commons.click(checkBoxElement);
	}
	private void continueClick() {
		commons.click(countinuElement);
	}
		
	
	
	public void businessAcSteps(String firstName, String lastName , String ssn,String dob, String country,String adress,String city,String state, String zipCode ) {
		businessClick();
		getStartedClick();
		openOnlineClick();
		yesClick();
		countinueClick();
		okayClick();
		applyClick();
		firstName(firstName);
		lastName(lastName);
		suffixClick();
		srClick();
		ssn(ssn);
		dob(dob);
		citizenShipClick();
		ResidentClick();
		country(country);
		banglaDeshClick();
		adress(adress);
		city(city);
		state(state);
		nY();
		zipCodE(zipCode);
		checkBox();
		continueClick();
	}
	
	

}
