package datadrivenfrmwrk;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class DDmtEx {
		
		WebDriver driver;
		public void setUp(){
			driver= new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().window().maximize();
		}
		
		
		public void loginTest() throws BiffException, IOException, InterruptedException{
			
			File fo=new File("g:\\Mtlogindata1.xls");
			Workbook wb=	Workbook.getWorkbook(fo);
			Sheet	ws=	wb.getSheet("logindata");
			
			for(int r=1; r < ws.getRows(); r++){
				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.name("userName")).sendKeys(ws.getCell(0, r).getContents());
				driver.findElement(By.name("password")).sendKeys(ws.getCell(1, r).getContents());
				driver.findElement(By.name("login")).click();
				
				Thread.sleep(3000);
				String pgTitle=driver.getTitle();
				if (pgTitle.contains("Find a Flight:")){
					System.out.println("Successful login operation");
					driver.findElement(By.linkText("SIGN-OFF")).click();
				}
				else{
					System.out.println("Unsuccessful login operation");
				}
			}
		}

		public void tearDown(){
			driver.close();
		}
		public static void main(String[] args) throws BiffException, IOException, InterruptedException {
			DDmtEx ddt= new DDmtEx();
			ddt.setUp();
			ddt.loginTest();
			ddt.tearDown();

		}

	}


