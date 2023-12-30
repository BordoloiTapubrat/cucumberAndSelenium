package com.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");
	}

//	@When("user enters user1 and pass1")
//	public void user_enters_user1_and_pass1() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user enters user2 and pass2")
//	public void user_enters_user2_and_pass2() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}