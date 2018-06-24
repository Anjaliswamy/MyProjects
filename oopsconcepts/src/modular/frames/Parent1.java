package modular.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent1 {
	//to perform user registration
	public void userReg(WebDriver driver){
		//to click on home link
		driver.findElement(By.linkText("Home")).click();
		//to click on register
		driver.findElement(By.linkText("REGISTER")).click();
		//to enter first name
		driver.findElement(By.name("firstName")).sendKeys("InsightQ");
		driver.findElement(By.name("email")).sendKeys("InsightQ");
		driver.findElement(By.name("password")).sendKeys("Mercury");
		driver.findElement(By.name("confirmPassword")).sendKeys("Mercury");
		
		driver.findElement(By.name("register")).click();
		System.out.println("User Registration operation completed");
	}
	//to close application
		public void tearDown(WebDriver driver){
			driver.close();
			System.out.println("Application closed successfully");
}
}