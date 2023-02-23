package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PIMPage extends BaseClass  {

	   @FindBy(xpath="//span[text()='PIM']")
	         WebElement  setPimPage;
	   
	   @FindBy(xpath="//h6[text()='PIM']")
       WebElement  txtPimPage;
	   
	 @FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	                WebElement textempid;
	   
	 @FindBy(xpath="//button[@type='submit']")
	           WebElement clickOnSerachBt;
	 
	 @FindBy(xpath="//*[@class='orangehrm-container']")
		WebElement searchedRecordId;
	 
	   public PIMPage(WebDriver driver) {
	    	   this.driver=driver;
	    	    PageFactory.initElements(driver, this);
	      }
	      
	      /**
	  	 * @Author : Rahul N Dharne
	  	 * 
	  	 * @{date} ${current date:date('2023-1-04')} 
	  	 * @ Descrption :This Test Methods is use to click on Pimpage 
	  	 *  
	  	 */ 
	       
	      public void ClickonPimPageLink() {
	    	  setPimPage.click();
	      }
	      /**
		  	 * @Author : Rahul N Dharne
		  	 * 
		  	 * @{date} ${current date:date('2023-1-06')} 
		  	 * @ Descrption :This Test Methods is use to get TitleofPimPage 
		  	 *  parameter return : String
		  	 */ 
	      
	      public String getPimPageTitle() {
	    	   return  txtPimPage.getText();
	      }
	      /**
		  	 * @Author : Rahul N Dharne
		  	 * 
		  	 * @{date} ${current date:date('2023-1-06')} 
		  	 * @ Descrption :This Test Methods is use to get empidsearch
		  	 *  
		  	 */ 
	      public void setempidsearch(String empid) {
	    	       textempid.click();  // we r providing empid
	      }
	      
	      /**
		  	 * @Author : Rahul N Dharne
		  	 * 
		  	 * @{date} ${current date:date('2023-1-06')} 
		  	 * @ Descrption :This Test Methods is use to click on searchempid
		  	 *  parameter return: String
		  	 */ 
	      public void clickOnSerachBt() {
	    	  clickOnSerachBt.click();
	      }
	      /**
		  	 * @Author : Rahul N Dharne
		  	 * 
		  	 * @{date} ${current date:date('2023-1-06')} 
		  	 * @ Descrption :This Test Methods is use to click on searchrecordempid
		  	 *  parameter return: String
		  	 */ 
	  public String getEmpIdFromSearchedResults(String empId) {
	    	  clickOnSerachBt.click();
	 return searchedRecordId.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
}
}
	      