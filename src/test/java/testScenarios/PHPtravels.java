package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PHPtravels {
	@Test
	public void f() throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("TestName");
		Thread.sleep(5000);

		// driver.findElement(By.id("demo")).click();

		// If webdriver click is not working, use Javascript click
		WebElement element = driver.findElement(By.id("demo"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
