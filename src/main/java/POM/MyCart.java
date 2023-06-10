package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyCart {
	
	@FindBy(xpath ="//h3[text()='adidas original']") private WebElement item;
	@FindBy(xpath ="//button[@class=\"btn btn-primary\"]") private List<WebElement> button;
	@FindBy(xpath="//i[@class='fa fa-trash-o']") private WebElement delete;
	
	public MyCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickbutton(String listitem,String cartitem)
	{
		String exp = item.getText(); 
		String act = listitem;
		Assert.assertEquals(act, exp);
		
		for(int i=0;i<button.size(); i++)
		{
			WebElement wb =button.get(i);
			String expect =wb.getText();
			String actual =cartitem;
			if(expect.equals(actual))
			{
				wb.click();
			}
		}
	}
	
	public void clickdelete()
	{
		delete.click();
	}

}
