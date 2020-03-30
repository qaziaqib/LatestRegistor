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
import org.openqa.selenium.interactions.Actions;
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
	    
		@Then("^I delete the record\\.$")
	public void i_delete_the_record() throws Throwable {
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
	     
		obj.load(objfile);
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("WebTable"))).click();
		
	boolean display;
	Thread.sleep(10000);
	driver.manage().window().maximize();                   
//	List <WebElement> webelement=	driver.findElements(By.xpath("//div[contains(@id,\"uiGrid-0005-cell\")]")); 
//	for(int i=0;i<webelement.size();i++)
//	System.out.println(( webelement.get(i)).getText());
	//int index =webelement.indexOf("lucasvaz.bastos@hotmail.com");
//	System.out.println(index);
	Actions action=new Actions(driver);
    Thread.sleep(10000);
//display=driver.findElement(By.xpath("//div[text()=\"Maheshraj@gmail.com\"]")).ispresent();

    do {
    	
    	try {
    	//	if(!driver.findElement(By.xpath("//div[text()='qazde@gmail.com']")).getText().equals(null))
     //   	{
        		String text=driver.findElement(By.xpath("//div[text()='qazde@gmail.com']")).getText();
        		System.out.println(text);
        		break;
        //	}
    	//	driver.findElement(By.xpath(obj.getProperty("Next"))).click();
    	}
    	catch(Exception babajii)
    	{
    		driver.findElement(By.xpath(obj.getProperty("Next"))).click();
    	}
    }while(true);
  //  while(!driver.findElement(By.xpath(obj.getProperty("Next"))).isEnabled());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

 //   while(driver.findElement(By.xpath("//div[text()='qazde@gmail.com']")).getText()==null)

	//driver.findElement(By.xpath(obj.getProperty("Next"))).click();
	Thread.sleep(4000);
	//display=driver.findElement(By.xpath("//div[text()=\"qazde@gmail.com\"]")).isDisplayed();



WebElement deletebutton=driver.findElement(By.xpath("//div[text()=\"qazde@gmail.com\"]/following::div[10]/del-click"));
//int size=WebElements.size();
	
	action.contextClick(deletebutton).perform();//performs right click

	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()=\"qazde@gmail.com\"]/following::div[11]/ul/li[1]")).click();
	driver.switchTo().alert().accept();//
	//driver.findElement(By.xpath(obj.getProperty("okay"))).click();
// System.out.println(size);
// System.out.println("hgdsjchsdgbcjzdchsdbhvsdh");


	}



}
