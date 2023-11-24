package org.forget;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgetPassword extends BaseClass {
	
	public static void main(String[] args) {
		launchBrowser();
		
		loadUrl("https://www.facebook.com/");
		maximaize();
		
	    toWait();
		
WebElement element = driver.findElement(By.className("_97w4"));
		
		toClick(element);
		WebElement find = driver.findElement(By.name("UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-lt4 _19_u"));
		fill(find, "maheshnxx@gmail.com");
		
		WebElement toScarch = driver.findElement(By.id("login_help"));
		toClick(toScarch);
		
		
	}

}
