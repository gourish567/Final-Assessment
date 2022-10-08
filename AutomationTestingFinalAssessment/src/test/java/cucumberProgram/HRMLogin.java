package cucumberProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLogin {
	WebDriver driver=null;
	@Given("open chrome browser")
	public void open_chrome_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
	}

	@When("Enter username nand password")
	public void enter_username_nand_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
	}

	@Then("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	@Given("Open leave portal")
	public void open_leave_portal() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//nav//div[2]//ul//li[3]//a")).click();
		driver.findElement(By.xpath("//header//div[2]//nav//li//a")).click();
	}

	@When("Enter the details and")
	public void enter_the_details_and() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();	
		driver.findElement(By.xpath("//form//input")).sendKeys("2022-04-21");
	}

	@Then("click applay")
	public void click_applay() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button")).click();
	}

	@Given("Open Admin portal")
	public void open_admin_portal() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//nav//div[2]//ul//li[1]//a")).click();
	}
	@When("Enter Search the details and")
	public void enter_search_the_details_and() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys("Admin");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//form//div[3]//input")).sendKeys("Sai M");
		  
	}
	@Then("click Search")
	public void click_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
}
