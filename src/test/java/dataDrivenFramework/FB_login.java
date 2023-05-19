package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_login {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		// Read excel sheet data
		// i. find the excel sheet path
		FileInputStream fi = new FileInputStream("C:\\Users\\nalla\\OneDrive\\Desktop\\test.xlsx");
		// Using Apache POI s/w, call excel workbook, sheet, Row, Cell(Column).
		//Workbook wb = new HSSFWorkbook(fi);//.xls
		Workbook wb = new XSSFWorkbook(fi);//.xlsx
		Sheet ws = wb.getSheet("Fb_login_Page");
		Row r = ws.getRow(2);
		Cell email = r.getCell(0);
		Cell password = r.getCell(1);
		
		System.out.println(email);
		System.out.println(password);
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(email.getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
		//driver.findElement(By.name("login")).click();
		//driver.quit();
	}
}
