package mainjava;

import org.openqa.selenium.WebDriver;

public abstract class BaseClass {
      // only variable will present 
	   public static WebDriver driver;        // we give abstract class becaue nobody shuld make object 
	    protected LoginPage loginpage;  // manage the variables from Base test  longinpagae varibale
	    protected  DashBoardofPage  dashboard ;
	    protected  PIMPage pimpage;
}                                                  // want to resctric webclass object
