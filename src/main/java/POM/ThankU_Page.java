package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankU_Page {
	
   @FindBy(xpath="//h1[text()=' Thankyou for the order. ']") private WebElement orderconfirm;
   
   public ThankU_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public String thanksmsg()
   {
	   String thankstext =orderconfirm.getText();
	   return thankstext;
   }

}
