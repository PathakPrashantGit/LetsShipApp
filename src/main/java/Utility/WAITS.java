package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS extends BaseClass {
	
	public static void putwait (String locaters)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locaters)));
	}

}
