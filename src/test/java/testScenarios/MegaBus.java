package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MegaBus {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get(" https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@name='termsAndPrivacy']")).click();

		// First Checkbox
		WebElement firstCheckbox = driver.findElement(By.xpath("//input[@name='termsAndPrivacy']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstCheckbox);

		// second checkbox
		WebElement secondCheckbox = driver.findElement(By.name("marketing"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", secondCheckbox);

	}
}
