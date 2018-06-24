package modular.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent2 extends Parent1{

		
		//to perform login operation
		public void userLogin(WebDriver driver) throws InterruptedException{
			//to click on Home link
			driver.findElement(By.linkText("Home")).click();
			//to perform login operation
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
			System.out.println("Successful login operation");

			
		}

}
