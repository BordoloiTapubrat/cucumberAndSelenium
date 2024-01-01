package com.StepDefinitions.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1. user_is_on_login_page");

	}

	@When("User enter username")
	public void user_enter_username() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2. user_enter_username");

	}

	@When("User enter password")
	public void user_enter_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3. user_enter_password");

	}

	@When("User Clicks on Login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4. user_clicks_on_login");

	}

	@Then("User is successfully Logged In")
	public void user_is_successfully_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step Validate. user_is_successfully_logged_in");

	}

	@Then("User have a search field on WebPage")
	public void user_have_a_search_field_on_web_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step Validate. user_have_a_search_field_on_web_page");

	}

	@When("User Clicks on Orders Link")
	public void user_clicks_on_orders_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5. user_clicks_on_orders_link");

	}

	@Then("Orders Page is displayed")
	public void orders_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step Validate. orders_page_is_displayed");

	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String string, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 6. i_search_for_a_product_with_name_and_price");

	}

	@Then("Multiple products of same category will be displayed")
	public void multiple_products_of_same_category_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step Validate. multiple_products_of_same_category_will_be_displayed");

	}

}
