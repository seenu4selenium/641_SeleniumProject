package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_login {
  @Test
  public void f() {
	  //Create webdriver Object
	  WebDriver driver;
	  
	  //Open Any browser
	  driver = new ChromeDriver();
	  
	  //Type FB URL
	  driver.get("https://www.facebook.com/");
	  
	  //Type USername & password
	  driver.findElement(By.name("email")).sendKeys("DummyTestEmail@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("sgfdsgdhgj234e5trb");
	  //Click on Login button
	  driver.findElement(By.name("login")).click();
	  
	  //Close the current window
	  //driver.close();
	  driver.quit();
	  System.out.println("adgsdfhgfs");
	  
  }
}
