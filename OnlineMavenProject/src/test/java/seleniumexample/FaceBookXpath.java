package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jhon");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jhony");
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

}
