package StepDefination;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class NseRegisterPageStep extends BaseClass {

	@Given("user is on nse register page")
	public void user_is_on_nse_register_page() {
		BaseClass.initialization();
	}

	@When("user enter {string}, {string} and {string}")
	public void user_enter_and(String string, String string2, String string3) {

	}

	@Given("user enter hint question and hint answer")
	public void user_enter_hint_question_and_hint_answer(DataTable dataTable) {

	}

	@Given("user enter password and confirm password")
	public void user_enter_password_and_confirm_password(DataTable dataTable) {

	}

}
