package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment5 {
  @Test
  public void f() throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://opencart-prf.exense.ch/");
		Thread.sleep(5000);
		//Click on iphone AddtoCart button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cart")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input")).click();
		
//		WebElement element = driver.findElement(By.name("account"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", element);
//		
  }
}
