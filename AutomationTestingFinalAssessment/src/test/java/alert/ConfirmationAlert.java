package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

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
		  HdfcAlert.dismiss();
		  driver.switchTo().defaultContent();
	}

}
