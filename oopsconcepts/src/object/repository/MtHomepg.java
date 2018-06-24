package object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtHomepg {
	//to assign wEbelement locators
		By userid=By.name("userName");
		By pwd=By.name("password");
		By signin=By.name("login");
		
		//create methods
		public WebElement useridObj(WebDriver driver){
			return(driver.findElement(userid));
		}
		
		public WebElement pwdObj(WebDriver driver){
			return(driver.findElement(pwd));
		}
		
		public WebElement signinObj(WebDriver driver){
			return(driver.findElement(signin));
		}


}
