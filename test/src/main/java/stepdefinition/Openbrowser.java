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

public class Openbrowser {
	WebDriver driver;
	@Given("^The registor page and open browser \"([^\"]*)\"$")
	public void the_registor_page(boolean browserOpen) throws Throwable {
		if(browserOpen==true) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win321\\chromedriver.exe"); //set property of driver
		
//		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();  //initiate chromebrowser
		 
		driver.get("http://demo.automationtesting.in/Register.html");  //pass url using get method of driver class
		 }
//		driver.manage().window().maximize();    //To maximize the window

	}
	

}
