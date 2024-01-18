package PageLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class NseRegisterPage extends BaseClass {
	
	@FindBy(xpath = "//label[text()='Title']//parent::div//select")
	private WebElement title;

	@FindBy(xpath = "//label[text()='First Name']/following-sibling::input")
	private WebElement firstName;

	@FindBy(xpath = "//label[text()='Email Address']/following-sibling::input")
	private WebElement lastName;

	@FindBy(xpath = "//label[text()='Mobile Number']/following-sibling::input")
	private WebElement mobileNumber;

	@FindBy(xpath = "//label[text()='User Id']/following-sibling::input")
	private WebElement userId;

	@FindBy(xpath = "//label[text()='Hint Question']/following-sibling::input")
	private WebElement hintQuestion;

	@FindBy(xpath = "//label[text()='Hint Answer']/following-sibling::input")
	private WebElement hintAnswer;

	@FindBy(xpath = "//label[text()='Password']/following-sibling::input")
	private WebElement password;

	@FindBy(xpath = "//label[text()='Confirm Password ']/following-sibling::input")
	private WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement register;

	@FindBy(xpath = "//input[@value='Reset']")
	private WebElement reset;
	
	public NseRegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateTitleFirstNameAndLastName(String title1, String firstName1, String lastName1) {
		
	}

	
}
