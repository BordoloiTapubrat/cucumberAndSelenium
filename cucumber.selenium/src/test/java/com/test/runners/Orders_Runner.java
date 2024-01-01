package com.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"resources/com/features/files/OrdersWorkFlow.feature"},
glue={"com.StepDefinitions.Orders","com.Orders.Hooks"},
tags = "@Regression or @Smoke",
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports/Cucumber-Report",
		"json:target/JsonReports/jsonReport.json",
		"junit:target/JunitReports/report.xml"
})
public class Orders_Runner {

}
