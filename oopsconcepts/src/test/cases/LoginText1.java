package test.cases;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import object.repository.MtHomepg;

	public class LoginText1 extends MtHomepg {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().window().maximize();
			
			//to perform login operation
			LoginText1 lt= new LoginText1();
			//to enter username
			lt.useridObj(driver).sendKeys("mercury");
			//to enter pwd
			lt.pwdObj(driver).sendKeys("mercury");
			// to click on Signin obj
			lt.signinObj(driver).click();
			

			
			Thread.sleep(3000);
			
			String pgTitle= driver.getTitle();
			if (pgTitle.contains("Find a Flight")){
				System.out.println("Successful login operation");
			}
			else{
				System.out.println("Unsuccessful login operation");
			}


		}
	


	}


