package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.Login_Page;
import Pojo.Browser;
import Utility.BaseClass;
import Utility.Parametrs;

public class LoginTests extends BaseClass {
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser)
	{
		driver =Browser.lunchUrl(browser);
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
	}

}
