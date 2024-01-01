package com.Orders.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class OrdersHooks {
	
	@Before("@Smoke")
	public void setup_browser(Scenario sc)
	{
		System.out.println(" @Smoke . Hook Setup setup_browser");
		System.out.println(" @Smoke . Scenario Name " +sc.getName());
	}
	
	@Before(order=1)
	public void setup_driver()
	{
		System.out.println("@Before 1. Hook Setup setup_driver");
	}
	
	@BeforeStep
	public void setup_prereq()
	{
		System.out.println("@BeforeStep Hook Setup setup_prereq");
	}
	
	@AfterStep
	public void captureScreenshot()
	{
		System.out.println("@AfterStep Hook AfterStep Capture Screenshot");
	}
	
	@After(order=1)
	public void tearDown()
	{
		System.out.println("@After 1 Hook tearDown");
	}
	
	@After(order=2)
	public void quit()
	{
		System.out.println("@After 2 Hook quit");
	}

}
