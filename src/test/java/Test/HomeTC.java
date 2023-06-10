package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Home_Page;
import POM.Login_Page;
import POM.MyCart;
import POM.PaymentMethod;
import POM.ThankU_Page;
import Pojo.Browser;
import Pojo.Browser_2;
import Utility.BaseClass;
import Utility.Parametrs;

public class HomeTC extends BaseClass {

	@BeforeMethod
	public void setUp()
	{
		driver =Browser_2.lunchUrl();
	}
	
	@Test
	public void LoginValidation() throws EncryptedDocumentException, IOException
	{
		Login_Page lg = new Login_Page(driver);
		
		String eaddress = Parametrs.getData("LetsShp", 1, 0);
		lg.emailaddress(eaddress);
		String passwd = Parametrs.getData("LetsShp", 1, 1);
		lg.password(passwd);
		lg.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Home_Page hp = new Home_Page (driver);
		hp.clickaddcart("ADIDAS ORIGINAL");
		hp.clickcart();
		
		MyCart mc = new MyCart (driver);
		mc.clickbutton("ADIDAS ORIGINAL", "Buy Now");
//		
		PaymentMethod pm = new PaymentMethod (driver);
		pm.putemail("Pathakprash@gmail.com");
		pm.putcountry("ind");
		pm.slectcont("india");
		pm.clickorder();
		
		ThankU_Page th = new ThankU_Page(driver);
		String text =th.thanksmsg();
		System.out.println(text);
	}
}
