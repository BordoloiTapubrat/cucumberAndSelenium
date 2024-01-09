package com.StepDefinitions.DataTableAsMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleDataTableAsMap {
	
	@Given("User is in the Registration page")
	public void user_is_in_the_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1. User is at Registration Page");
	    
	}

	@When("User Enters the below details")
	public void user_enters_the_below_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println("Step 2. Get Data");
		
		List<Map<String ,String >> userData = dataTable.asMaps(String.class, String.class);
		//System.out.println(userData);
		
		
		for(Map<String, String>e : userData)
		{
			e.forEach((K,V)->System.out.println(" Key - "+K+" | Value - "+V));
			System.out.println("-----------------------------");
		}
		
		System.out.println();
		
	}

	@Then("User is Registered Successfully")
	public void user_is_registered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3. User Registration is successful");
	}

}
