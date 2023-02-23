package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  extends BaseClass {
	                                         // we EXTENDS baseTest for initBrowser
	// All locators of Page
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement textLoginPage;    // variable
	
	@FindBy(name="username")
	   WebElement username;    // variable
	
	 @FindBy(name="password")
	      WebElement  pass;
	 @FindBy(tagName="button")
	       WebElement  btn;

	// intiallizatioin of locators/variables
	public LoginPage(WebDriver driver) { // constructor parameterized //because driver is in BaseTest class
		this.driver = driver;            // thise driver come from Baseclass to besttest to Loginpage by extending
		PageFactory.initElements(driver, this);      //globle driver matching local driver  ,we use thise keyword for  current loginpage

	}

	// methods requried to perform test steps

	/**
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} @ Descrption :This Test Methods
	 * isto verify LoginPageTitle Parameter return : String
	 */

	public String titleofLoginPage() {
		return textLoginPage.getText();
	}

	/**
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} @ Descrption :This Test Methods
	 * isto verify Current URL OF PAGE Parameter return : String
	 */
	public String  CurrentUrlOfPage() {
		       return  driver.getCurrentUrl();
		    
	}
	/**
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} @ Descrption :This Test Methods
	 * isto verify Current URL OF PAGE Parameter return : String
	 */
	public void setUserName(String userName) {
	       username.sendKeys(userName);   //variable
}
	/**                                            
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} 
	 * Descrption : This test method is used to setUserNameValue
	 *  Parameter return : String
	 */
	public void setPassword(String password) {
		     pass.sendKeys( password);     // variable
}
	/**
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} 
	 * @ Descrption :This Test Methods is used setPassword value  
	 *  Parameter return : String
	 */
	public void clickLoginBtn() {
		btn.click();
	}
	/**
	 * @Author : Rahul N Dharne
	 * 
	 * @{date} ${current date:date('2023-1-04')} 
	 * @ Descrption :This Test Methods used to get BuildTitle 
	 *  Parameter return : String
	 */
	 public String getBuildTitle() {
		  return driver.getTitle();
	 }
}	
