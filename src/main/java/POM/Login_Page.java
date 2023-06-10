package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	@FindBy(id="userEmail") private WebElement email;
	@FindBy(xpath ="//*[@id='userPassword']") private WebElement pass;
	@FindBy(xpath ="//*[@value='Login']") private WebElement submit;
	@FindBy(xpath="//*[text()='Register']") private WebElement registeration;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void emailaddress(String mail)
	{
		email.sendKeys(mail);
	}
	public void password(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void login()
	{
		submit.click();
	}
	
	public void reg()
	{
		registeration.click();
	}

}
