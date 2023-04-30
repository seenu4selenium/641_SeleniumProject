package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseVsQuit {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		//driver = new ChromeDriver();
		//driver= new FirefoxDriver();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		// Maximize the window
		driver.manage().window().maximize();		
		driver.findElement(By.id("windowButton")).click();		
		Thread.sleep(5000);
		//Close the browser
//		driver.close();
		driver.quit();
	}
}
