package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class aglysis1
{
	static WebDriver driver;
	Properties obj = new Properties();

	@Given("^login and click on submenu tshirts \"([^\"]*)\" email \"([^\"]*)\" password \"([^\"]*)\" count \"([^\"]*)\"$")
	public void login_and_click_on_submenu_tshirts_email_password_count(boolean browserOpen,String Email,String password,int count) throws IOException
	{FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
    
	obj.load(objfile);
	if(browserOpen==true) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Downloads\\chromedriver_win321\\chromedriver.exe"); //set property of driver
		
//		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();  //initiate chromebrowser
		 
		driver.get(" http://automationpractice.com/index.php"); 
		driver.manage().window().maximize();
		//pass url using get method of driver class
		driver.findElement(By.xpath(obj.getProperty("signin.btn"))).click();
		driver.findElement(By.xpath(obj.getProperty("email.input"))).sendKeys(Email);
		driver.findElement(By.xpath(obj.getProperty("password.input"))).sendKeys(password);
		driver.findElement(By.xpath(obj.getProperty("sign.btn"))).click();
		 Actions actions = new Actions(driver);
		 WebElement Women=driver.findElement(By.xpath(obj.getProperty("women.link")));
		 actions.moveToElement(Women).perform();
		 driver.findElement(By.xpath(obj.getProperty("Tshirts.btn"))).click();
			JavascriptExecutor rs = (JavascriptExecutor) driver;
			
			rs.executeScript("window.scrollBy(0,500)");
		 Actions actions1 = new Actions(driver);
		 WebElement firstElement=driver.findElement(By.xpath(obj.getProperty("firstitem")));
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		
		}
		 actions1.moveToElement(firstElement).perform();
		 driver.findElement(By.xpath(obj.getProperty("More.btn"))).click();
		 for(int i=0;i<count;i++)
		 driver.findElement(By.xpath(obj.getProperty("plus.btn"))).click();
		
	}
//	
}
	@Then("^Select size \"([^\"]*)\" color \"([^\"]*)\" and add to cart and count \"([^\"]*)\" and amount \"([^\"]*)\"$")
	public void select_size_color_and_add_to_cart(String Size, String color,int count,String Unitprice) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
	    
		obj.load(objfile);
		Select size=new Select(driver.findElement(By.xpath(obj.getProperty("selectSize.btn"))));
		size.selectByVisibleText(Size);
		
		driver.findElement(By.xpath("//*[@title='"+color+"']")).click();
		driver.findElement(By.xpath(obj.getProperty("Addtocart.btn"))).click();
		Thread.sleep(5000);
		String confirmsg=driver.findElement(By.xpath(obj.getProperty("confirmsg"))).getText();
		System.out.println(confirmsg);
		String msg="Product successfully added to your shopping cart";
		
		Assert.assertEquals(msg,confirmsg);
		String colsiz=color +","+" ".concat(Size);
		System.out.println(colsiz);
		
	String colorsize=	driver.findElement(By.xpath("//span[@id=\"layer_cart_product_attributes\"]")).getText();
	System.out.println(colorsize);
	Assert.assertEquals(colsiz,colorsize);
String quantity=	driver.findElement(By.xpath("//strong[text()=\"Quantity\"]/following::span[1]")).getText();
int quantityexpected= Integer.parseInt(quantity);
int quantityseen=count+1;
Assert.assertEquals(quantityexpected,quantityseen);
driver.findElement(By.xpath(obj.getProperty("checkout.btn"))).click();
String unitprice=	driver.findElement(By.xpath("(//span[contains(@id,\"product_price\") and @class=\"price\"])[1]")).getText();
Assert.assertEquals(unitprice,Unitprice);
driver.findElement(By.xpath(obj.getProperty("checkout1.btn"))).click();
driver.findElement(By.xpath(obj.getProperty("checkout2.btn"))).click();
driver.findElement(By.xpath(obj.getProperty("termsagree.chk"))).click();
driver.findElement(By.xpath(obj.getProperty("checkout1.btn"))).click();

	driver.close();
	
		
	   
	}

}
