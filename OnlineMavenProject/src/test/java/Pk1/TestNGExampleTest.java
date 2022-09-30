package Pk1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
 
public class TestNGExampleTest {
    WebDriver driver=null;

@Test
       public void testCase1() {
	driver.findElement(By.xpath("//nav//div[2]//ul//li[3]//a")).click();
	  driver.findElement(By.xpath("//header//div[2]//nav//li//a")).click();
	  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
	  driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();	
	  driver.findElement(By.xpath("//form//input")).sendKeys("2022-04-21");
	  driver.findElement(By.xpath("//button")).click();
		
		System.out.println("in test case 1");
       }
 
       // test case 2
       @Test
       public void testCase2() {
    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p")).click();
   		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li[4]")).click();
              System.out.println("in test case 2");
       }
 
       @BeforeMethod
       public void beforeMethod() {
    	   System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
   		driver = new ChromeDriver();
   		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
   		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
   		driver.findElement(By.xpath("//button[@type='submit']")).click();
              System.out.println("in beforeMethod");
       }
 
       @AfterMethod
       public void afterMethod() {
              System.out.println("in afterMethod");
       }
 
       @BeforeClass
       public void beforeClass() {
              System.out.println("in beforeClass");
       }
 
       @AfterClass
       public void afterClass() {
              System.out.println("in afterClass");
       }
 
       @BeforeTest
       public void beforeTest() {
              System.out.println("in beforeTest");
       }
 
       @AfterTest
       public void afterTest() {
              System.out.println("in afterTest");
       }
 
       @BeforeSuite
       public void beforeSuite() {
              System.out.println("in beforeSuite");
       }
 
       @AfterSuite
       public void afterSuite() {
              System.out.println("in afterSuite");
       }
}