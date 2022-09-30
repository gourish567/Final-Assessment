package stepdefinations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HRM {
	WebDriver driver=null;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("//nav//div[2]//ul//li[3]//a")).click();
	  driver.findElement(By.xpath("//header//div[2]//nav//li//a")).click();
	  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
	  driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();	
	  driver.findElement(By.xpath("//form//input")).sendKeys("2022-04-21");
	  driver.findElement(By.xpath("//button")).click();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
