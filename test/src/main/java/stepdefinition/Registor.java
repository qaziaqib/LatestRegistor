package stepdefinition;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registor
{   //System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	static WebDriver driver;
	 Properties obj = new Properties();	
//	;driver.findElement(By.xpath("")).getScreenshotAs(OutputType.FILE);
	// Load file so we can use into our script
	@Given("^The registor page and open browser \"([^\"]*)\"$")
	public void the_registor_page(boolean browserOpen) throws Throwable {
		if(browserOpen==true) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win321\\chromedriver.exe"); //set property of driver
		
//		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();  //initiate chromebrowser
		 
		driver.get("http://demo.automationtesting.in/Register.html");  //pass url using get method of driver class
		 }
	
	}



@Then("^I will the neccessary detials like username \"([^\"]*)\" Email \"([^\"]*)\" PhoneNo \"([^\"]*)\"$")
public void i_will_the_neccessary_detials_like_username(String FirstName,String Email,String PhoneNo) throws Throwable {
	
		
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
	    obj.load(objfile);
	    Thread.sleep(5000);
		driver.findElement(By.xpath(obj.getProperty("FirstName"))).sendKeys(FirstName);
		WebElement Element=driver.findElement(By.xpath(obj.getProperty("LastName")));
			Element.sendKeys("Nawaz");
			WebElement E1=driver.findElement(By.id("imagesrc"));
		//	((RemoteWebElement E1 ).setFileDetector(new LocalFileDetector());
			E1.sendKeys("C:/Users/hp/Desktop/image.jpeg");
			driver.findElement(By.xpath(obj.getProperty("Area"))).sendKeys("Kashmir");
			driver.findElement(By.xpath(obj.getProperty("Email"))).sendKeys(Email);
			driver.findElement(By.xpath(obj.getProperty("phoneno"))).sendKeys(PhoneNo);
			driver.manage().window().maximize();
			driver.findElement(By.xpath(obj.getProperty("Gender"))).click();
			driver.findElement(By.xpath(obj.getProperty("Hobbies1"))).click();
			driver.findElement(By.xpath(obj.getProperty("Hobbies2"))).click();
			
			//sdfsdb
			
			
JavascriptExecutor rs = (JavascriptExecutor) driver;
			
			rs.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.id("msdd")).click();
			Thread.sleep(1000);
			Select drpCountry = new Select(driver.findElement(By.id("countries")));
			Thread.sleep(5000);
			driver.findElement(By.xpath(obj.getProperty("Language1"))).click();
			driver.findElement(By.xpath(obj.getProperty("Language2"))).click();
			WebElement element = driver.findElement(By.xpath("//*[text()='Persian']")); 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,100)");
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			driver.findElement(By.xpath("//*[text()='Persian']")).click(); 
			Select skillsdropdown=new Select(driver.findElement(By.id("Skills")));
			Thread.sleep(3000);
			skillsdropdown.selectByVisibleText("C++");
			Select countriesdropdown=new Select(driver.findElement(By.id("countries")));
			countriesdropdown.selectByValue("Bangladesh");
			
			
			
			
			
			
			
			
			
			driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Bangladesh");
			driver.findElement(By.xpath("//*[text()='Bangladesh' and @class='select2-results__option select2-results__option--highlighted']")).click();
			Select drpYear = new Select(driver.findElement(By.id("yearbox")));
			drpYear.selectByVisibleText("1994");
			Select drpmont = new Select(driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")));
			
			drpmont.selectByVisibleText("April");
Select drpday = new Select(driver.findElement(By.id("daybox")));
			
			drpday.selectByVisibleText("14");
			driver.findElement(By.id("firstpassword")).sendKeys("Admin@123");
			driver.findElement(By.id("secondpassword")).sendKeys("Admin@123");
			js.executeScript("window.scrollBy(200,0)");
			
			
			
			
			
			
			
			
			
			
			
			
//	driver.findElement(By.xpath("//*[text()='Bangladesh']")).click();
		//	drpCountry.selectByIndex(1);
			//drpCountry.selectByVisibleText("Arabic");
		//	Select dropdown=new Select(Languagedropdown);
		//	dropdown.selectByIndex(10);
			Thread.sleep(1000);
			driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\hp\\Desktop\\image.jpeg"); 
  
}

@Then("^click on registor$")
public void click_on_registor() throws Throwable {
	 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
	    obj.load(objfile);
	driver.findElement(By.xpath(obj.getProperty("signup"))).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(obj.getProperty("Registor"))).click();

}}

