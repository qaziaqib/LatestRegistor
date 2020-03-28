package stepdefinition;



import java.io.File;
import java.io.FileInputStream;
import java.util.List;
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
	 @Given("^The registor page and open Browser \"([^\"]*)\"$")
		public void the_registor_page(boolean browserOpen) throws Throwable {
			if(browserOpen==true) {
			System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win321\\chromedriver.exe"); //set property of driver
			
//			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();  //initiate chromebrowser
			 
			driver.get("http://demo.automationtesting.in/Register.html");  //pass url using get method of driver class
			 }
//			driver.manage().window().maximize();    //To maximize the window
			
		}
	    
	@Given("^I click Edit button and make changes$")
	public void i_click_Edit_button_and_make_changes() throws Throwable {
		 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
		     
		obj.load(objfile);
		driver.findElement(By.xpath(obj.getProperty("WebTable"))).click();
		Thread.sleep(10000);
	boolean display;
	
 List  list=(List<WebElement>) driver.findElement(By.xpath("//*[text()='qazicse@gmail.com']"));}
 
  
//	if(list.size()==0);
// System.out.println("no such element");
		
	
	}
		
		

	@Then("^I delete the record\\.$")
	public void i_delete_the_record() throws Throwable {
	   
	}



}
