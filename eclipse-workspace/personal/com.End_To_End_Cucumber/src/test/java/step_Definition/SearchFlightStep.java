package step_Definition;

import org.testng.Assert;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlightStep extends BaseClass {

	@Given("user should be on the HomePage")
	public void user_should_be_on_the_home_page() {
		String actualTitle = getDriver().getTitle();
		String expectedTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@When("user click on one way Radio button")
	public void user_click_on_one_way_radio_button() {

	}

	@Then("user select city From Dropdown")
	public void user_select_city_from_dropdown() {

	}

	@Then("user select city To Dropdown")
	public void user_select_city_to_dropdown() {

	}

	@Then("user select the date from Calender")
	public void user_select_the_date_from_calender() {

	}

	@Then("user click on Search Flights button")
	public void user_click_on_search_flights_button() {

	}

}
