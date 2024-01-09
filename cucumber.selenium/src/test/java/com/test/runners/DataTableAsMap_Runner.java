package com.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"resources/com/features/files/DataTableAsMaps.feature"},
glue={"com.StepDefinitions.DataTableAsMap"},
tags = "@RegressionTest",
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports/Cucumber-Report",
		"json:target/JsonReports/jsonReport.json",
		"junit:target/JunitReports/report.xml"
})
public class DataTableAsMap_Runner {

}
