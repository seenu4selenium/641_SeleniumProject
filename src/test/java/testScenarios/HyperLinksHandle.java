package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLinksHandle {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Click on forgotpassword hyperlink
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("wor")).click();

		//Wait statement
		Thread.sleep(4000);
		
		//Click on Messenger link on forgotpassword page
		driver.findElement(By.linkText("Messenger")).click();
	}
}
