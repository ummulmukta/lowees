package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Cucumber",
		glue="com.stepdef",
		plugin={ "pretty","testng:target/cucumber-reports/Cucumber.xml","json:target/cucumber-reports/Cucumber.json"},
		//tags="@Tagss"
				//tags="@testTwo",
		monochrome=true
		
		
		
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
