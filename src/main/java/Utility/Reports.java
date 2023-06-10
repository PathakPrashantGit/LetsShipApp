package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports getReport()
	{
		ExtentReports repo = new ExtentReports();
		ExtentSparkReporter sparkrepo= new ExtentSparkReporter("AllReports.html");
		sparkrepo.config().setReportName("Web Autometed By Pathak");
		sparkrepo.config().setDocumentTitle("LetsShops");
		repo.attachReporter(sparkrepo);
		repo.setSystemInfo("Tester", "Prashant");
		return repo;
	}

}
