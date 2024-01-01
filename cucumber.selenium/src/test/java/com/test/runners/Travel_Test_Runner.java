package com.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"resources/com/features/files/TravelBooking.feature"},
glue={"com.StepDefinitions.TravelBooking"},
tags = "@All",
//tags = "@Regression",
//tags = "@Smoke",
//tags = "@Regression or @Smoke",
//tags = "@Regression and @Integration",
//tags = "@Prod",
//tags = "@Dev",
//tags = "not @Integration",
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports/Cucumber-Report",
		"json:target/JsonReports/jsonReport.json",
		"junit:target/JunitReports/report.xml"
})
public class Travel_Test_Runner {
	
	//Excute with Maven 
	
	//mvn test -Dcucumber.filter.tags="@Smoke"

}
