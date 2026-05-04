package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public void setEmail(String mailid)
	{
		email.sendKeys(mailid);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
     
	public void ClickLoginButton()
	{
		loginButton.click();
	}
	
	
}
