package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.Loginpage;

import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.junit.Assert;

import org.openqa.selenium.chrome.ChromeDriver;


public class Steps extends BaseClass {

	public WebDriver driver;
	public Loginpage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		launchBrowser();
		driver = new ChromeDriver();
		lp = new Loginpage(driver);

	}

	@When("User open URL {string}")
	public void user_open_url(String url) throws InterruptedException {

		driver.get(url);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on lLogin")
	public void click_on_l_login() {
		lp.clickLogin();
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String title) {

		driver.getTitle();
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());

		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.clickLogout();

		// Thread.sleep(3000);

	}

	@Then("page Title should be {string}")
	public void page_title_should_be1(String string) {

	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();

	}

}


	

