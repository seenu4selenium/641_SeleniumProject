package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GetText_Demo {
	WebDriver driver;

	@Test
	public void tc_01_clg() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(8000);
		// Click on Submit button without fill any data(mandatory fields)
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		// Get the error message for Firstname element
		String fnErrorMsg = driver.findElement(By.id("ConfirmPasswordError")).getText();
		System.out.println(fnErrorMsg);
	}

	@Test
	public void tc_02_fb() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.className("_8eso")).getText());
	}
}
