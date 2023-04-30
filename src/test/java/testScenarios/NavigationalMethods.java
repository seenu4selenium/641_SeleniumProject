package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NavigationalMethods {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Click on Forgot password? hyperlink
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		//Type email editbox data
		driver.findElement(By.name("email")).sendKeys("Farida@Gamil.com");
		Thread.sleep(3000);
		//Click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(3000);		
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(3000);		
		//Click on forword icon
		driver.navigate().forward();
		
		
		//Close the current window
		driver.close();
		
	}
}
