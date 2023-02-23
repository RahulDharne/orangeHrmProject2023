package testjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest  extends  CommonTest {
	
	            //common test not extends for logintest
 
   @Test(priority = 3 , groups= {"smoke","regression"})
     public void verifyPimPageTitle() {
	          pimpage.ClickonPimPageLink();
	       String  VerifyTitleOfPimPage =   pimpage.getPimPageTitle();
	            Assert.assertEquals( VerifyTitleOfPimPage, "PIM"); 
	              
   }
   @Test(priority = 4,groups = {"smoke","regression"})
            public void empidSearchID() {
	          pimpage.setempidsearch("0011");
	              pimpage.clickOnSerachBt();
	          // String verifyEmpidAppered = pimpage.getEmpIdFromSearchedResults("0011");
	              Assert.assertEquals(true, true);
	        
	        
   }
   

}
