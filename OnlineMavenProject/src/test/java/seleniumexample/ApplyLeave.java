package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyLeave {
	WebDriver driver = new ChromeDriver();
	  void login()
	  {
		    
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
	  void leave() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//nav//div[2]//ul//li[3]//a")).click();
		  driver.findElement(By.xpath("//header//div[2]//nav//li//a")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
		  driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();	
		  driver.findElement(By.xpath("//form//input")).sendKeys("2022-04-21");
		  driver.findElement(By.xpath("//button")).click();

	  }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		ApplyLeave obj=new ApplyLeave();
		obj.login();
		obj.leave();
	}

}
