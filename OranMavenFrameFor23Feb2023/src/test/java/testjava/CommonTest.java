package testjava;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest  extends BaseTest{
 

     @BeforeClass
   public void Login() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 loginpage.setUserName("Admin");
   loginpage.setPassword("admin123");
   loginpage.clickLoginBtn();
      String   TitleofDashBoard =  dashboard.TitleofDashBoardOfPage();
      Assert.assertEquals( TitleofDashBoard, "Dashboard");
}
}