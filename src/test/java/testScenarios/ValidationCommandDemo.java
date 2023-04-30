package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidationCommandDemo {
	WebDriver driver;

	// IsSelected()
	// @Test
	public void tc01() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		Thread.sleep(5000);
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(5000);

		// Validate 'Subscribe for monthly newsletters' checkbox is selected?
		if (driver.findElement(By.id("checkbox1")).isSelected()) {
			System.out.println("Subscribe for monthly newsletters checkbox is selected");
		} else {
			System.out.println("Subscribe for monthly newsletters checkbox is NOT selected");
		}
	}

	// IsEnabled():
	// @Test
	public void tc02() throws Exception {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/nalla/OneDrive/Desktop/Selenium/Exam_14Oct2022/QE%20-%20index.html");
		Thread.sleep(5000);

		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled()) {
			System.out.println("Button1 element is Enable state");
		} else {
			System.out.println("Button1 element is Not in Enable state / Disable state");
		}

		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled()) {
			System.out.println("Button2 element is Enable state");
		} else {
			System.out.println("Button2 element is Not in Enable state / Disable state");
		}

	}

	// IsDisplayed():
	@Test
	public void tc03() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(8000);

		// Verify the SUBMIT button is Displayed on Screen?
		if (driver.findElement(By.id("submit")).isDisplayed()) {
			System.out.println("Submit button is displayed on screen");
		} else {
			System.out.println("Submit button is NOT displayed on screen");
		}

	}

}
