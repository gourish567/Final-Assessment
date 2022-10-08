package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMApplyeLeave {
	  WebDriver driver=null;
	  @Test (priority=0)
	  public void Login() throws InterruptedException
	  {
	    System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
 
	  }
	  @Test (priority=0)
	  public void applyLeave()
	  {
		  driver.findElement(By.xpath("//nav//div[2]//ul//li[3]//a")).click();
		  driver.findElement(By.xpath("//header//div[2]//nav//li//a")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
		  driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();	
		  driver.findElement(By.xpath("//form//input")).sendKeys("2022-04-21");
		  driver.findElement(By.xpath("//button")).click();
	  }
}
