package oopsconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLangEX {
	WebDriver driver;
	//to initialize browser and to open url
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		}
	//to click on language link
	public void langclick(String myLanguage) throws InterruptedException{
		driver.findElement(By.linkText(myLanguage)).click();
		Thread.sleep(3000);
		}
	//to close application
	public void tearDown(){
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
	GoogleLangEX gl=new GoogleLangEX();
	gl.setUp();
	gl.langclick("తెలుగు");
	gl.langclick("English");
	gl.tearDown();

	}

}
