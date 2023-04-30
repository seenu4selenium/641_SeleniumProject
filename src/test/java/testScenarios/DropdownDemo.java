package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  //Click on Create new account button
	  driver.findElement(By.linkText("Create new account")).click();	  
	  Thread.sleep(5000);
	  //Dropdown 
	  new Select(driver.findElement(By.id("month"))).selectByVisibleText("Aug");	  
	  new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("15");
	  new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1947");
	  
  }
}
