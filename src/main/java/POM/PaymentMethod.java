package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;
import Utility.WAITS;

public class PaymentMethod{
	
	@FindBy(xpath ="//label[text()='prashant.pathak@gmail.com']//following::input[@type=\"text\"]") private WebElement edres;
	@FindBy(xpath="//input[@placeholder='Select Country']") private WebElement country;
    @FindBy(xpath="//button[@class='ta-item list-group-item ng-star-inserted']") private List<WebElement> listedcountry;	
    @FindBy(xpath ="//a[@class='btnn action__submit ng-star-inserted']") private WebElement placorder;	
   
	public PaymentMethod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void putemail(String email)
	{
		edres.clear();
		edres.sendKeys(email);
	}
	public void putcountry(String cont)
	{
		country.sendKeys(cont);
	}
	
	public void slectcont(String loc)
	{
		for(int i=0; i<listedcountry.size();i++)
		{
			WebElement wb =listedcountry.get(i);
			String text = wb.getText();
			String act = loc;
			if(text.equalsIgnoreCase(act))
			{
				wb.click();
			}
		}
	}
	public void clickorder()
	{
		placorder.click();
	}
}
