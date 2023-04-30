package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandleDemo {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		// Click on First Clickme button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);

		// Alert code
		// Switch your cursor point from main page to Alert page
		// Get the alert text
		System.out.println("Alert text is: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Confirmation alert code
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		//Click on Cancel button on Confirmation alert
		driver.switchTo().alert().dismiss();
				
	}
	
}
