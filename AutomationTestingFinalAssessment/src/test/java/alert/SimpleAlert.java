package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
		  Thread.sleep(1000);
		  HdfcAlert.accept();
		  driver.switchTo().defaultContent();
		  System.out.println(actualResult);
		  String expectedResult="Customer ID  cannot be left blank1.";
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualResult, expectedResult);
		  System.out.println("After assertion");
	}

}
