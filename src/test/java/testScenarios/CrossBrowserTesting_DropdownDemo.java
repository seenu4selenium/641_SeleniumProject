package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_DropdownDemo {
	WebDriver driver;

	@Parameters("browserName")//chrome
	@BeforeClass
	public void browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("EDge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		// Click on Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		// Dropdown
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Aug");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("15");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1947");
	}
}
