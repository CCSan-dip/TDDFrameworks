package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class RegisterPageStep extends BaseClass {
	protected RegisterPage rp ;
	@Given("user is on create account page")
	public void user_is_on_create_account_page() {
		BaseClass.initialization("chrome");
	}

	@When("user enter {string}, {string} and select {string}")
	public void user_enter_and_select(String string, String string2, String string3) {
		rp.validateFirstLastNameAndGenderFunctionality(string, string2, string3);
	}

	@When("user enter {string}, {string} and ,{string}")
	public void user_enter_and(String string, String string2, String string3) {
		rp.validateEmailAndPassword(string, string2, string3);
	}

	@When("user enter company {string}, {string}, {string}, {string}, {string}")
	public void user_enter_company(String string, String string2, String string3, String string4, String string5) {
		rp.validatConpanyDetails(string, string2, string3, string4, string5);
	}

	@When("user select country from {string} dropdown")
	public void user_select_country_from_dropdown(String string) {
		rp.validateCountry(string);
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		rp.validatePostalCodeAndPhoneNumber(string, string2);
	}

	@Given("user select {string} from dropdown")
	public void user_select_from_dropdown(String string) {
		rp.validateRole(string);
	}

	@Given("user enter {string}")
	public void user_enter(String string) {
		rp.validateSubscriptionKey(string);
	}

}
