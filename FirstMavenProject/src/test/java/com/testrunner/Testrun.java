package com.testrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.common.CrosBrowsserBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue="com.stepdef",
		
		//tags="@log,@mhover"
		tags="@drp"
		)

public class Testrun extends AbstractTestNGCucumberTests {

/*@Parameters({ "browser" })
	
	  @BeforeTest public static void setUpScenario(String browser) {
	  CrosBrowsserBase.getBrowser(); //getBrowserInstantiation(browser); }
	 
}}*/
}