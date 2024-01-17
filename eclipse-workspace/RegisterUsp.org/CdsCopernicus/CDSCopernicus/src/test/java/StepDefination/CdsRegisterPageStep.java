package StepDefination;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CdsRegisterPageStep extends BaseClass  {

	@Given("user is on the cds create account page")
	public void user_is_on_the_cds_create_account_page() {
	   
	}

	@When("user enter {string}, {string} and {string}")
	public void user_enter_and(String string, String string2, String string3) {
	 
	}

	@When("user select {string} from drop down")
	public void user_select_from_drop_down(String string) {
	   
	}

	@When("user select sector from drop down")
	public void user_select_sector_from_drop_down(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Given("user click on organization check box")
	public void user_click_on_organization_check_box() {
	   
	}

	@When("user enter {string} name in text box")
	public void user_enter_name_in_text_box(String string) {
	    
	}

	@When("user click on data store and data protection check boxes")
	public void user_click_on_data_store_and_data_protection_check_boxes() {
	   
	}
}
