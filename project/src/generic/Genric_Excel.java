package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

import pom_scripts.Login;

public class Genric_Excel  {
	@Test
	public static void getData() throws EncryptedDocumentException, IOException {
		String val="";
		FileInputStream fis= new FileInputStream("./excel/Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet s = book.getSheet("Sheet1");
val = s.getRow(0).getCell(1).getStringCellValue();
System.out.println(val);

		
		
	}

}
