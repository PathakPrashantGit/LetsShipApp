package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrs {
	
	public static String getData(String sheetname,int a, int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Documents\\Pathak Eclips\\LetsShop\\src\\test\\resources\\Test Data.xlsx");
	
	  String exceldata =WorkbookFactory.create(file).getSheet(sheetname).getRow(a).getCell(b).getStringCellValue();
	
	  return exceldata;
	
	}

}
