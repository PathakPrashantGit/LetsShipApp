package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy (xpath="//div[@class=\"card-body\"]//b") private List<WebElement> cardbody;
	@FindBy(xpath="(//button[@class=\"btn w-10 rounded\"])[2]") private WebElement addcart;
	@FindBy(xpath ="//button[@routerlink=\"/dashboard/cart\"]") private WebElement cart ;
	
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickaddcart (String product)
	{
		for(int i=0; i<cardbody.size(); i++)
		{
			String exp =cardbody.get(i).getText();
			 String act =product;
			 
			 if(exp.equalsIgnoreCase(act))
			 {
				 addcart.click();
			 }
		}
		
		
	}
	
	public void clickcart()
	{
		cart.click();
	}

}
