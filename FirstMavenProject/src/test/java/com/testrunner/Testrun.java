package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue="com.stepdef"
		//tags="@mhover"
		//tags="@log,@mhover"
		//tags="@drp"
		)

public class Testrun extends AbstractTestNGCucumberTests {

}
