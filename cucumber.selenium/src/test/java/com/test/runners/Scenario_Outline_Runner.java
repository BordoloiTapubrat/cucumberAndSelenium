package com.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"resources/com/features/files/ExampleScenarioOutline.feature"},
glue={"com.StepDefinitions.ScenarioOutline"},
tags = "@RegressionTest",
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports/Cucumber-Report",
		"json:target/JsonReports/jsonReport.json",
		"junit:target/JunitReports/report.xml"
})
public class Scenario_Outline_Runner {

}
