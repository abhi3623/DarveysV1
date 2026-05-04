package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginPage extends BaseClass {

	@Test
	public void Verify_login()
	{
		logger.info("***starting TC002*****");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.ClickLoginButton();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean target_page = mp.isMyAccountPageExist();
		Assert.assertTrue(target_page);
				
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
}
