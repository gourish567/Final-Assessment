package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeWebsite {
	 WebDriver driver = new ChromeDriver();
  void login()
  {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//nav//div[2]//ul//li[1]//a")).click();
  }
  void search(String username)
	{
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
  void search(String username , String Empname) throws InterruptedException
  {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form//div[3]//input")).sendKeys(Empname);
		driver.findElement(By.xpath("//form//div//button[2]")).click();

  }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		OrangeWebsite obj=new OrangeWebsite();
		obj.login();
		obj.search("Admin","Paul Collings");
		
	}

	

}
