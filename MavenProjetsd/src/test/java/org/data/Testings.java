package org.data;

import java.awt.AWTException;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testings extends BaseClass {

	@BeforeTest
	private void Launch() {
		launchBrowser();

	}

	@BeforeMethod
	private void openURL() {
		loadUrl("https://adactinhotelapp.com/SearchHotel.php");
		maximaize();
	}

	@Test
	public void testCases() throws AWTException, InterruptedException {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahesh125");
		driver.findElement(By.cssSelector("#password")).sendKeys("WY80A6");
		WebElement fin = driver.findElement(By.xpath("//input[@name='login']"));
		fin.click();

		WebElement sel = driver.findElement(By.xpath("//select[@id='location']"));

		Select(sel);

		s.selectByValue("Brisbane");

		toRobTab();
		WebElement fi = driver.findElement(By.id("hotels"));
		Select(fi);

		s.selectByValue("Hotel Sunshine");
		toRobTab();

		WebElement bed = driver.findElement(By.id("room_type"));
		Select(bed);
		s.selectByValue("Double");
		toRobTab();
		WebElement no = driver.findElement(By.id("room_nos"));
		Select(no);
		s.selectByValue("6");

		WebElement rom = driver.findElement(By.id("adult_room"));
		Select(rom);
		s.selectByValue("3");

		WebElement Rom = driver.findElement(By.id("child_room"));
		Select(Rom);
		s.selectByValue("2");
		toRobTab();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		toWait();

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		toWindowHandles();

		driver.findElement(By.className("reg_input")).sendKeys("Mahesh kumar");
		toRobTab();
		driver.findElement(By.name("last_name")).sendKeys("K");
		toRobTab();
		driver.findElement(By.name("address")).sendKeys("210A, puthukkottai , distic, Tamilnadi 62222");
		toRobTab();
		driver.findElement(By.name("cc_num")).sendKeys("9876543456789087");
		toRobTab();
		WebElement card = driver.findElement(By.id("cc_type"));
		Select(card);
		s.selectByValue("VISA");
		toRobTab();

		WebElement mon = driver.findElement(By.name("cc_exp_month"));
		Select(mon);
		s.selectByValue("3");
		toRobTab();

		WebElement yer = driver.findElement(By.name("cc_exp_year"));
		Select(yer);
		s.selectByValue("2013");
		toRobTab();

		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys("24356366473");
		toRobTab();

		driver.findElement(By.name("book_now")).click();
		driver.findElement(By.name("my_itinerary")).click();
		toWindowHandles();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.className("reg_button")).click();

	}

	@AfterSuite
	private void testclose() {

		driver.quit();

	}
}
