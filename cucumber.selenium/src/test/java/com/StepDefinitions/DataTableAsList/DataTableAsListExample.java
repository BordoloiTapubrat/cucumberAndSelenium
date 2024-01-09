package com.StepDefinitions.DataTableAsList;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableAsListExample {
	
	@Given("User is in Registration Page")
	public void user_is_in_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Step 1. User is on Registration Page");
	}

	@When("User Enters the following user details")
	public void user_enters_the_following_user_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> usersList = dataTable.asLists(String.class);
		System.out.println("Step 2. User's Data");
		for(List<String>user  : usersList)
		{
			System.out.println(user);
		}

	}

	@Then("User Registration should be successfull")
	public void user_registration_should_be_successfull() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3. User is Registered");

	}


}
