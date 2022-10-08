package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.aptransport.org/");
		  Actions mouse=new Actions(driver);
		  Thread.sleep(1000);
		  mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
		  Thread.sleep(2000);
		  mouse.click(driver.findElement(By.xpath("//ul[@id='mainmenu']//li[3]//div//h3//a"))).build().perform();
	}

}
