package com.StepDefinitions.TravelBooking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TravelPage {
	
	
	@Given("User wants to Book a Flight from {string} to {string}")
	public void user_wants_to_book_a_flight_from_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Regression");
		System.out.println("Step 1 : user_wants_to_book_a_flight_from_to");
	    
	}

	@When("User Enters From and To Location For Flight")
	public void user_enters_from_and_to_location_for_flight() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression");
		System.out.println("Step 2 :  user_enters_from_and_to_location_for_flight");
	    
	}

	@When("Selects Travel Date For Flight")
	public void selects_travel_date_for_flight() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression");
		System.out.println("Step 3 :  selects_travel_date_for_flight");
	  
	}

	@When("Clicks on Search Button For Flight")
	public void clicks_on_search_button_for_flight() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression");
		System.out.println("Step 4 :  clicks_on_search_button_for_flight");
	   
	}

	@Then("Available Fight Details are Displayed")
	public void available_fight_details_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression");
		System.out.println("Step Validation :  available_fight_details_are_displayed");
	    
	}
	
	//----------------------

	@Given("User wants to Book a Train from {string} to {string}")
	public void user_wants_to_book_a_train_from_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Smoke");
		System.out.println("Step 1 :  user_wants_to_book_a_train_from_to");
	   
	}

	@When("User Enters From and To Location For Train")
	public void user_enters_from_and_to_location_for_train() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Smoke");
		System.out.println("Step 2 :  user_enters_from_and_to_location_for_train");
	   
	}

	@When("Selects Travel Date For Train")
	public void selects_travel_date_for_train() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Smoke");
		System.out.println("Step 3 :  selects_travel_date_for_train");
	}

	@When("Clicks on Search Button For Train")
	public void clicks_on_search_button_for_train() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Smoke");
		System.out.println("Step 4 :  clicks_on_search_button_for_train");
	    
	}

	@Then("Available Train Details are Displayed For Train")
	public void available_train_details_are_displayed_for_train() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Smoke");
		System.out.println("Step Validation :  available_train_details_are_displayed_for_train");
	    
	}

	//-------------------------------------
	
	@Given("User wants to Book a Bus from {string} to {string}")
	public void user_wants_to_book_a_bus_from_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Regression And Integration");
		System.out.println("Step 1 : user_wants_to_book_a_bus_from_to");
	    
	}
	
	@When("User Enters From and To Location For Bus")
	public void user_enters_from_and_to_location_for_bus() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Regression And Integration");
		System.out.println("Step 2 : user_enters_from_and_to_location_for_bus");
	   
	}

	@When("Selects Travel Date For Bus")
	public void selects_travel_date_for_bus() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression And Integration");
		System.out.println("Step 3 : selects_travel_date_for_bus");
	    
	}

	@When("Clicks on Search Button For Bus")
	public void clicks_on_search_button_for_bus() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression And Integration");
		System.out.println("Step 4 : clicks_on_search_button_for_bus");
	   
	}

	@Then("Available Bus Details are Displayed For Bus")
	public void available_bus_details_are_displayed_for_bus() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Regression And Integration");
		System.out.println("Step Validation : available_bus_details_are_displayed_for_bus");
	    
	}
	
	//----------------------------
	
	@Given("User wants to Book a Cab from {string} to {string}")
	public void user_wants_to_book_a_cab_from_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Prod");
		System.out.println("Step 1 : user_wants_to_book_a_cab_from_to");
	    
	}
	

	@When("User Enters From and To Location For Cab")
	public void user_enters_from_and_to_location_for_cab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prod");
		System.out.println("Step 2 : user_enters_from_and_to_location_for_cab");
	    
	}

	@When("Selects Travel Date For Cab")
	public void selects_travel_date_for_cab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prod");
		System.out.println("Step 3 : selects_travel_date_for_cab");
	    
	}

	@When("Clicks on Search Button For Cab")
	public void clicks_on_search_button_for_cab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prod");
		System.out.println("Step 4 : clicks_on_search_button_for_cab");
	   
	}

	@Then("Available Cab Details are Displayed For Cab")
	public void available_cab_details_are_displayed_for_cab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prod");
		System.out.println("Step Validation : available_cab_details_are_displayed_for_cab");
	    
	}
	
	//----------------------------------

	@Given("User wants to Book a Hotel in {string}")
	public void user_wants_to_book_a_hotel_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Dev");
		System.out.println("Step 1 : user_wants_to_book_a_hotel_in");
	    
	}

	@When("User Enters from {string} to {string} For Hotel")
	public void user_enters_from_to_for_hotel(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dev");
		System.out.println("Step 2 : user_enters_from_to_for_hotel");
	    
	}

	@When("Clicks on Search Button For Hotel")
	public void clicks_on_search_button_for_hotel() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dev");
		System.out.println("Step 3 : clicks_on_search_button_for_hotel");
	    
	}

	@Then("Available Hotel Details are Displayed For Hotel")
	public void available_hotel_details_are_displayed_for_hotel() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dev");
		System.out.println("Step Validation : available_hotel_details_are_displayed_for_hotel");
	}

}
