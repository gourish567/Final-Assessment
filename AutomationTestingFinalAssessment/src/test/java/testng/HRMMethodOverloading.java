package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRMMethodOverloading {
	WebDriver driver=null;
	  @Test(dataProvider = "dp",priority=0)
	  public void search(String username, String Empname) throws InterruptedException {
		  driver.findElement(By.xpath("//nav//div[2]//ul//li[1]//a")).click();
		  driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//form//div[3]//input")).sendKeys(Empname);
		  driver.findElement(By.xpath("//form//div//button[2]")).click();
	  }
	  @Test (dataProvider = "dp1",priority=1)
	  public void search(String username) throws InterruptedException
	  {
		  driver.findElement(By.xpath("//nav//div[2]//ul//li[1]//a")).click();
		  driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']//div[2]")).click();
		  driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
		  driver.findElement(By.xpath("//form//div//button[2]")).click();
	  }
	  @Test
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
	 
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      { "Admin", "Sai M" },
	    };
	  }
	  @DataProvider
	  public Object[][] dp1() {
	    return new Object[][] {
	      { "Admin"},
	    };
	  }

}
