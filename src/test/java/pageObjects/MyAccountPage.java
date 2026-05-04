package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//img[@class='img-fluid d-block mx-auto']")
WebElement ImgLogo;
	
@FindBy(xpath="//button[@id='dropdown-basic']")
WebElement myAccountIcon;

@FindBy(xpath="//a[normalize-space()='Logout']")
WebElement Logout;

public boolean isMyAccountPageExist()
{
	try
	{
	return (ImgLogo.isDisplayed());
	}
	catch (Exception e)
	{
       return false;
	}
}

public void ClickLogout() {
	
	myAccountIcon.click();
	Logout.click();
	
}


}
