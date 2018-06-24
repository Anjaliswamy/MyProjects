package modular.frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass extends Parent2{
	
		
		public static WebDriver driver;
		//to initialize browser
		public void setUp(){
			driver= new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().window().maximize();
		
		}

		public static void main(String[] args) throws InterruptedException {
			DriverClass dc= new DriverClass();
			dc.setUp();
			dc.userReg(driver);
			dc.userLogin(driver);
			dc.tearDown(driver);

		}

	}
	