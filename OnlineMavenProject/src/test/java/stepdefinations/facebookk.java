package stepdefinations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class facebookk {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D20460%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeaOFYgCwqlndwDbUdIH9VMVcrruf51kvpqePRYMCclIN9eTSr1RbdxoCoAwQAvD_BwE");
		driver.findElement(By.name("firstname")).sendKeys("Jhon");
		driver.findElement(By.name("lastname")).sendKeys("Jhony");
		driver.findElement(By.name("reg_email__")).sendKeys("Xyz@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Xyz@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Xyz121232wq");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByIndex(9);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("May");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.name("websubmit")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  
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
