package testjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashBoardofPage;
import mainjava.LoginPage;
import mainjava.PIMPage;

public class BaseTest  extends BaseClass {

	   //Launching Program
	@BeforeSuite  
	  public void initBrowser() {    
		WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver();            //driver need globle                     //we can use now direct driver aftrr extending
		      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		      driver.manage().window().maximize();
		      driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );		      
	}
	 @BeforeClass
	      public void pageobjects() {  // we need to bring loginpage methods in baseclass becaue we alredy has extends earlier
		  loginpage = new LoginPage(driver);    //page object constructor matching arguments from pagefactory need to match agruments
		  dashboard  =  new DashBoardofPage(driver);   // globel driver
		   pimpage =  new PIMPage(driver);
		   
}
	 
	 @AfterClass
	 public void Logoutuser() {
		  dashboard.logout();    // we use dashboard beacause its in dashboard page 
	 }
	@AfterSuite
	  public void tearDownEnvironment() {
		   driver.quit();                 //if noy get quit wwrite logoutcode
	}
}
