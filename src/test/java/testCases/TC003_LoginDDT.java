package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)	
  public void verify_LoginDDT(String email , String pwd , String exp) throws InterruptedException
  {
	  logger.info("****starting the TC003_DDT Login****");
	  
	  try {
	   
	  HomePage hp = new HomePage(driver);
	  hp.clickLogin();
	  
	  LoginPage lp = new LoginPage(driver);
	  lp.setEmail(email);
	  lp.setPassword(pwd);
	  lp.ClickLoginButton();
	  
	  System.out.println("**going to account page***");
	  
	  MyAccountPage map = new MyAccountPage(driver);
	  boolean target_page = map.isMyAccountPageExist();
	  
	/*  if(exp.equalsIgnoreCase("valid"))
	  {
		  if(target_page==true)
		  {
			 map.ClickLogout();
			 Assert.assertTrue(true);                                     //Assert.assertTrue(true);			  
		  }
		  else
		  {
			  Assert.assertFalse(false);
		  }
	  }
	  
	  if(exp.equalsIgnoreCase("invalid"))
	  {
		  if(target_page==true)
		  {
			  map.ClickLogout();
			  Assert.assertTrue(false);
		  }
		  else
		  {
			  System.out.println("Test case passed.......");
			  Assert.assertFalse(true);
		  }
	  }
	  }*/
	  
	  if(exp.equalsIgnoreCase("valid"))
	  {
	      if(target_page)
	      {
	          map.ClickLogout();
	          Assert.assertTrue(true);
	      }
	      else
	      {
	          Assert.fail();
	      }
	  }
	  else if(exp.equalsIgnoreCase("invalid"))
	  {
	      if(!target_page)
	      {
	          Assert.assertTrue(true);
	      }
	      else
	      {
	          map.ClickLogout();
	          Assert.fail();
	      }
	  }
	}
	  
	  catch(Exception e)
	  {
		  
		  Assert.fail();
		  //System.out.println("The test case is failed.....");
	  }
	  
	  Thread.sleep(1000);
	  logger.info("****TC_003_DDTLogin__Finished test case");
	  
	  
  }

	
}
