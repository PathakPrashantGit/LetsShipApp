package Pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Switch_Case extends BaseClass {
	
 public static WebDriver lunchUrl(String browser) {
	
	 switch(browser.toLowerCase())
	 {
	 case "chrome":
	 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 break;
		
	 case "forefox":
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 break;
		 
	 case "edge":
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 break;
	 }
		
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		return driver;
}	


}
