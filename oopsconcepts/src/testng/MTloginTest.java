package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MTloginTest {

	WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@Test
	@Parameters({"userid","passwd"})	//to read data from TestNg xml file
	public void userLogin(String userid, String passwd) throws InterruptedException{
		//to perform login operation
		driver.findElement(By.name("userName")).sendKeys(userid);
		driver.findElement(By.name("password")).sendKeys(passwd);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
	//TestNg Assert class to validate page title
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		//to send user msg into XML reports and log section
		Reporter.log("Successful Login operation", true);
		
	}
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
