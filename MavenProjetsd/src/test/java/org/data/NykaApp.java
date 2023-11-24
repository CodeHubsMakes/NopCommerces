package org.data;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaApp extends BaseClass {

	public static void main(String[] args) {

		launchBrowser();
		driver.get("https://www.nykaa.com/sp/skin-native-desktop/skin");
		driver.manage().window().maximize();

		
	}

}
