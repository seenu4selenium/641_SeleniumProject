package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JRI_login {
  @Test
  public void f() {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  //type date into All edit boxes
	  driver.findElement(By.name("txtUserName")).sendKeys("Nirupama@gmail.com");
	  driver.findElement(By.id("txtPasswd")).sendKeys("sdgw45rgdf");
	  driver.findElement(By.id("txtCaptcha")).sendKeys("234");
	  
	  //Click on Secure signin button
	  driver.findElement(By.name("imgbtnSignin")).click();
  }
}
