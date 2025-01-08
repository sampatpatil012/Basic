package step_Definition;

import com.BaseLayer.BaseClass;
import com.PageLayer.AlertPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertStep extends BaseClass {
	AlertPage alert;

	@Given("user should be on Homepage and validate Title")
	public void user_should_be_on_homepage_and_validate_title() throws Exception {
		BaseClass.getURL();
		String title = getDriver().getTitle();
		System.out.println(title);
	}

	@When("user click on Alert button")
	public void user_click_on_alert_button() throws Exception {
		alert = new AlertPage();
		alert.clickOnAlertButton();
		//new AlertPage().clickOnAlertButton();

	}

	@Then("Alert Pop-up should be display and user click on Ok button")
	public void alert_pop_up_should_be_display_and_user_click_on_ok_button() {
		alert.clickOnAccept();

	}

	@Then("user click on Confirm button")
	public void user_click_on_confirm_button() {
		alert.clickOnConfirmButton();
	}

	@Then("Alert Pop-up should be display and user copy the Text")
	public void alert_pop_up_should_be_display_and_user_copy_the_text() {
		String confirmText = alert.confirm_getText();
		System.out.println(confirmText);
	}

	@Then("click on cancel button")
	public void click_on_cancel_button() throws InterruptedException {
		alert.clickonDismissButton();
	}

	@Then("user enter Text in TextBox as {string} and click on confirm button")
	public void user_enter_text_in_text_box_as_and_click_on_confirm_button(String value) {
		alert.enterTextBox(value);
		alert.clickOnConfirmButton();

	}

	@Then("user copy the Physical Text and click on ok button")
	public void user_copy_the_physical_text_and_click_on_ok_button() {
		String confirmText = alert.confirm_getText();
		System.out.println(confirmText);
	}

}
