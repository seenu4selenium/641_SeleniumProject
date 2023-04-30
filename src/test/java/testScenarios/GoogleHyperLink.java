package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleHyperLink {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Click on Images hyper link
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("ma")).click();

	}
}
