package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="feature/Registor.feature",
glue= { "stepdefinition" })
public class TestRunner {


	
	 
	}


