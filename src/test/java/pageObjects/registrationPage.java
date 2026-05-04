package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends BasePage {

	public registrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath="//input[@id='first_name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email_address;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement mob_number;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	@FindBy(xpath="//button[normalize-space()='Create new account']")
	WebElement Create_account_link;
	
	
	public void Click_Account_Link()
	{
		Create_account_link.click();
	}
	
	
	public void SetName(String name)
	{
		this.name.sendKeys(name);
	}
	
	public void SetEmail(String email)
	{
		this.email_address.sendKeys(email);
	}
	
	public void PhoneNumber(String number)
	{
		this.mob_number.sendKeys(number);
	}
	
	public void SetPassword(String pwd)
	{
		this.pwd.sendKeys(pwd);
	}
	
	public void ClickButton()
	{
		button.click();
	}
	
	

	
}
