package stepdefinition;



import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class Delete {
	WebDriver driver;
	 Properties obj = new Properties();
	 
	    
	@Given("^I click Edit button and make changes$")
	public void i_click_Edit_button_and_make_changes() throws Throwable {
		 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
		     
		obj.load(objfile);
	}

	@Then("^I delete the record\\.$")
	public void i_delete_the_record() throws Throwable {
	   
	}



}
