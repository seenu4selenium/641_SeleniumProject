package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteTheTestData {
	@Test
	public void f() throws Exception {
		// Create Excel file using Apache POi Fileoutput stream
		FileOutputStream fo = new FileOutputStream(".\\src\\test\\resources\\testing.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet ws = wb.createSheet("abc");
		Row r = ws.createRow(1);
		Cell c = r.createCell(1);

		c.setCellValue("Durga");
		r.createCell(2).setCellValue("Farida");
		r.createCell(6).setCellValue("Selenium 12334445");
		
		
		Row r1 = ws.createRow(5);
		Cell c1 = r1.createCell(10);
		c1.setCellValue("My mobile number is: 9874563210");
		
		wb.write(fo);
		wb.close();

	}
}
