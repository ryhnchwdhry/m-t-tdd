package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Commons;

public class AboutYou {
	WebDriver driver;
	Commons commons;
	
	public AboutYou(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;
	}
	
	//@FindBy(xpath ="//div[@class='hero-text-box-gradient -gradient-on']" )
	//WebElement titlElement;
//	
//	private void getTitle(String expected) {
//		assertEquals(expected, commons.getText(titlElement));
//	}
//	
//	private void getCurrentUrl(String expectedUrl) {
//	assertEquals(expectedUrl, commons.getCurrentUrl(driver));
//	}
//	
//	public void aboutYouSteps(String expected, String expectedUrl) {
//		getTitle(expected);
//		getCurrentUrl(expectedUrl);
//	}
	
	//private void getTitle(String expected) {
		//assertEquals(commons.getText(titlElement), expected);
		
	//}
	//public void aboutYouSteps(String expected) {
		//getTitle(expected);
	//}
}
