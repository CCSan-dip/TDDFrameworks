package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class RegisterPage extends BaseClass {

	@FindBy(xpath = "//input[@id='givenName']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='sn']")
	private WebElement lastname;

	@FindBy(xpath = "//select[@id='gender']")
	private WebElement gender;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void validateFirstLastNameAndGenderFunctionality(String fname1, String lname1,String gender1) {
		firstname.sendKeys(fname1);
		lastname.sendKeys(lname1);
		HandleDropDown.clickOnDropDownElement(gender, gender1);

	}

	public void validateEmailAndPassword(String email1, String psw1, String confirmPsw1) {
		
	}

	public void validatConpanyDetails(String companyName1, String jobTitle1, String streetAddress1, String city1,
			String state1) {

	}

	public void validateCountry(String counrtyName1) {

	}

	public void validatePostalCodeAndPhoneNumber(String postalCode1, String phonenumber1) {

	}

	public void validateRole(String role1) {

	}

	public void validateIndustry(String industry1) {

	}

	public void validateSubscriptionKey(String subscriptionKey1) {

	}
}
