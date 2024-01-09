package com.StepDefinitions.ScenarioOutline;

import static org.testng.Assert.*;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleScenarioOutline {
	
	double amount;
	double taxAmount;
	double serviceCharge;
	double finalAmount;
	
	@Given("User in on Bill Calculation Page")
	public void user_in_on_bill_calculation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1. User is on Bill Calculation Page");
	}

	@When("User Enters the Amount {string}")
	public void user_enters_the_amount(String amount) {
	    // Write code here that turns the phrase above into concrete actions
		this.amount = Double.parseDouble(amount);
		 System.out.println("Step 2. User Enters the Amount"+this.amount);
	}

	@When("User Enters the Tax Amount {int}")
	public void user_enters_the_tax_amount(Integer taxAmount) {
	    // Write code here that turns the phrase above into concrete actions
		this.taxAmount = taxAmount;
		 System.out.println("Step 3. User Enters the Tax Amount"+this.taxAmount);
	}

	@When("User Enters the Service Charge {string}")
	public void user_enters_the_service_charge(String serviceCharge) {
	    // Write code here that turns the phrase above into concrete actions
		this.serviceCharge = Double.parseDouble(serviceCharge);
		System.out.println("Step 4. User Enters the Service Charge"+this.serviceCharge);
	}
	
	@When("User Clicks On Calculate Button")
	public void user_clicks_on_calculate_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5. User Clicks On Calculate Button");
	}

	@Then("Final Amount is Calculated {string}")
	public void final_amount_is_calculated(String finalAmount) {
	    // Write code here that turns the phrase above into concrete actions
		
		this.finalAmount = this.amount+this.taxAmount+this.serviceCharge;
		System.out.println(finalAmount);
		System.out.println("Step 6. Final Amount is Calculated");
		Assert.assertTrue(this.finalAmount == Double.parseDouble(finalAmount));
	}




}
