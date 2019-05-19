package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Lib  implements IAutoConstant{
	public static String getCellvalue(String sheetNmae,int rowNum, int colNum) {
		String cellValue="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			cellValue = wb.getSheet(sheetNmae).getRow(rowNum).getCell(colNum).toString();
		} catch (Exception e) {
		}
		return cellValue;
	}
	public static String getPropertyValue(String ProprtyName) {
String PropertyValue="";
Properties prop = new Properties();	
try {
	prop.load(new FileInputStream(CONFIG_FILE_PATH));
	PropertyValue = prop.getProperty(ProprtyName);
}catch(Exception e) {
}
      return PropertyValue;
	}
	
	public static Workbook wb;
	public static int getTotalRowCount(String sheetName ) {
		int totalRowCount=0;
		try {
			FileInputStream excelobj = new FileInputStream(EXCEL_PATH);
			wb= WorkbookFactory.create(excelobj);
			totalRowCount = wb.getSheet(sheetName).getLastRowNum();
		}catch(Exception e) {
		}
		return totalRowCount ;
	}
	public static void captureScreenshot(WebDriver driver,String testMethodName) {
		try {
		String currentdateandtime = new Date().toString().replaceAll(":","_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH + testMethodName+":"+currentdateandtime+".png");
		Files.copy(Source, dest);
		} catch (IOException e) {
		}
	}
}
