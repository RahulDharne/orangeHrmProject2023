package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class DashBoardofPage extends BaseClass{

	// All locators of Page
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	       WebElement  txtDashboard;  // VARIABLE
	

	
	@FindBy(css=".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
	            WebElement logouttxt;
	
	@FindBy(xpath="//a[text()='Logout']")
	           WebElement txtLogOut;
	
	// intiallizatioin of locators/variables
	     public  DashBoardofPage(WebDriver driver) {
	       this.driver=driver;
	        PageFactory.initElements(driver, this);
	     }
	
	
	
	// All methods of page
	     /**
	      * @author Rahul N Dharne

	      *@{date} ${current date:date('2023-02-04')}
	      * @ Descrption : This method is used to verify DashBoard Ofpage
	      * Parameter return:String
	      */    
	     
	      public String TitleofDashBoardOfPage() {
	    	      return txtDashboard.getText();  // variable we put txtDashbOARD
	      }
	      /**
		      * @author Rahul N Dharne

		      *@{date} ${current date:date('2023-02-08')}
		      * @ Descrption : This method is used to Logouthrm
		      * Parameter return:String
		      */    
	       public void logout() {
	    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	    driver.navigate().refresh();
	    	   logouttxt.click();
	    	   txtLogOut.click(); 
	       }
}
