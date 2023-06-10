package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.Login_Page;
import Pojo.Browser;
import Pojo.Browser_2;
import Utility.BaseClass;
import Utility.Parametrs;

public class LoginTest_DataProvider extends BaseClass {
	
	@BeforeMethod
	public void setUp()
	{
		driver =Browser_2.lunchUrl();
	}
	
	@Test(dataProvider ="getdata")
	public void LoginValidation(String email,String pwd ) throws EncryptedDocumentException, IOException
	{
		Login_Page lg = new Login_Page(driver);
		
		
		lg.emailaddress(email);
		
		lg.password(pwd);
		lg.login();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data = new Object[3][2];
		
		data[0][0] ="prashant.pathak@gmail.com";
		data[0][1] ="Prashant@97";
		data[1][0] = "anikapathak@gmail.com";
		data[1][1] ="Anika@10";
		data[2][0] ="akshatpathak@gmail.com";
		data[2][1] ="Akky@2019";
		return data;
				
	}

}
