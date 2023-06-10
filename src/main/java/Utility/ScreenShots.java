package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots extends BaseClass  {
	
	public static String getScreenShot(String name) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\Screenshots\\"+name+".jpg";
		
		File dest = new File(path);
		
		FileHandler.copy(source, dest);
		return path;
	}

}
