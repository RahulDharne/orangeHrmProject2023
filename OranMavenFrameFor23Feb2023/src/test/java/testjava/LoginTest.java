package testjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {   //parts of unitTesting

	  @Test(priority = 0, groups= {"smoke","regression"})
	  public void  verifyTitleofLoginPage() {
		       String   verifyTitleofloginpage =  loginpage.titleofLoginPage();
		          Assert.assertEquals( verifyTitleofloginpage, "Login");  // title of login page "LOGIN"
	  }
	  
	    @Test(priority = 1,groups = {"smoke","regression"})
	    public void verifyCurrentUrlOfPage() {
	    	 String verifyCurrentUrlOfPage   = loginpage.CurrentUrlOfPage(); 
	    	    Assert.assertEquals(verifyCurrentUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }
	    @Test(priority = 2,groups = {"smoke","regression"})
	       public void verifyloginWithCorrectCrediential() {
	    	         loginpage.setUserName("Admin");
	    	         loginpage.setPassword("admin123");
	    	         loginpage.clickLoginBtn();
	    	   String  titleofdash  =  dashboard.TitleofDashBoardOfPage();	
	    	   Assert.assertEquals( titleofdash, "Dashboard");
	    }
	    @Test(priority = -1,groups = {"smoke","regression"})
	          public void verifyBuildTitleName() {
	    	       String  verifytitleBuild   =  loginpage.getBuildTitle();
	    	       Assert.assertEquals(verifytitleBuild, "OrangeHRM");
	    }
}
