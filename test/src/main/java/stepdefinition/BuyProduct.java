package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BuyProduct 
{static WebDriver driver;
Properties obj = new Properties();
int priceOne;
int priceTwo;
int  priceThree;
int  Totalprice;
	@Given("^The registor page and open the browser \"([^\"]*)\"$")
	public void the_registor_page_and_open_the_browser(boolean browserOpen) throws Throwable {
		if(browserOpen==true) {
			System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win321\\chromedriver.exe"); //set property of driver
			
//			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();  //initiate chromebrowser
			 
			driver.get("http://demo.automationtesting.in/Register.html");  //pass url using get method of driver class
			 }
//		
	}

	
	@Then("^I book a online product ProductOne \"([^\"]*)\" ProductTwo \"([^\"]*)\" productThree \"([^\"]*)\"$")
	public void i_book_a_online_product_ProductOne_ProductTwo_productThree(String product1, String product2, String product3) throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	   
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
	     
		obj.load(objfile);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(obj.getProperty("practicesite.btn"))).click();
		Thread.sleep(10000);
		JavascriptExecutor rs = (JavascriptExecutor) driver;
		
		rs.executeScript("window.scrollBy(0,1000)");
	if(product1!=null)
	{
		driver.findElement(By.xpath("//h3[text()='"+product1+"']/following::a[1]")).click();
		String price1=driver.findElement(By.xpath("//h3[text()='"+product1+"']/following::span[2]")).getText();
		 int inend=price1.indexOf(".");
		 price1=price1.substring(1,inend);
		 priceOne= Integer.parseInt(price1);
	//	String price=price1.substring(1);
		System.out.println( priceOne);
Thread.sleep(3000);
}
	if(product2!=null)
	{
		driver.findElement(By.xpath("//h3[text()='"+product2+"']/following::a[1]")).click();
		String price2=driver.findElement(By.xpath("//h3[text()='"+product2+"']/following::span[4]")).getText();
		 int inend=price2.indexOf(".");
		 price2=price2.substring(1,inend);
		 priceTwo= Integer.parseInt(price2);
		 System.out.println(priceTwo);
		Thread.sleep(3000);
}	
	if(product3!=null)
	{
		driver.findElement(By.xpath("//h3[text()='"+product3+"']/following::a[1]")).click();
		String price3=driver.findElement(By.xpath("//h3[text()='"+product3+"']/following::span[2]")).getText();
		 int inend=price3.indexOf(".");
		 price3=price3.substring(1,inend);
		  priceThree= Integer.parseInt(price3);
		 System.out.println(priceThree);
		Thread.sleep(3000);
}	
	 Totalprice=priceOne+priceTwo+priceThree;
	System.out.println( Totalprice);
	String amount=driver.findElement(By.xpath(obj.getProperty("Amount.btn"))).getText();
	int inend=amount.indexOf(".");
	 amount=amount.substring(1,inend);
	 Pattern p = Pattern.compile("\\d+");
     Matcher m = p.matcher(amount);
     String am = "";
     while(m.find()) {
    	 am += m.group();
	}int Amount= Integer.parseInt(am);
	
     Assert.assertEquals(Totalprice,Amount);
     System.out.print(am);
     driver.findElement(By.xpath("//*[@class=\"cartcontents\"]")).click();
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//*[text()='"+product1+"']/ancestor::tr[1]/td[1]/a[1]")).click();	
    }
	}
