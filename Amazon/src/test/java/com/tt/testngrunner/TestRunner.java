package com.tt.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature/Login.feature",
		glue=""
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
