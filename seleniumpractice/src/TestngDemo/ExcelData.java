package TestngDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream nnnn = new FileInputStream("./testdata/log.xlsx");
		Workbook Wc = WorkbookFactory.create(nnnn);
		Sheet sh = Wc.getSheet("Login");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String username = c.toString();
		String password = Wc.getSheet("Login").getRow(1).getCell(1).toString();
		System.out.println(username +":"+password);
	}
}
