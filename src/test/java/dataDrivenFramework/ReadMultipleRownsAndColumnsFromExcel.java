package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadMultipleRownsAndColumnsFromExcel {
	WebDriver driver;

	@Test
	public void fbResting() throws IOException, Exception {
		String results;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		FileInputStream fi = new FileInputStream(".\\fbRetesting.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("fbtest");

		for (int i = 1; i < 9; i++) {
			Row r = ws.getRow(i);
			Cell email = r.getCell(0);
			Cell password = r.getCell(1);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(email.getStringCellValue());
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
			driver.findElement(By.name("login")).click();
			Thread.sleep(7000);
			// Validate the error message?
			if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
					|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {

				System.out.println("Given credentials were in-valid");
				results = "Fail";

			} else {
				System.out.println("Given credentials were valid");
				results = "Pass";
				// Logout scripts here
			}

			Cell res = r.createCell(2);
			res.setCellValue(results);

		} // for loop end

		// After execute all rows of data, the result temp will store in RAM location
		// From RAM location we will move it to Excel sheet by using FileoutputStrem
		FileOutputStream fo = new FileOutputStream(".\\fbRetesting.xlsx");
		wb.write(fo);
		wb.close();

	}
}
