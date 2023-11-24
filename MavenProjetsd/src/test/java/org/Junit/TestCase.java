package org.Junit;

import org.baseclass.BaseClass;
import org.junit.Test;
import org.pojo.LoginPojo;

public class TestCase extends BaseClass {

	@Test

	public void test1() {

		
		 launchBrowser();
		 loadUrl("https://www.facebook.com/login/"); 
		 maximaize();
		 
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "Ashok12344@gmail.com");
		fill(l.getTxtpass(), "Ashok123");
		toClick(l.getBtnLogin());
		toQuit();

	}

	@Test
	public void test2() {
		
		  launchBrowser(); 
		  loadUrl("https://www.facebook.com/login/");
		  maximaize();
		 
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "mahesh07ybdv@gmail.com");
		fill(l.getTxtpass(), "maheshdbcnhc");
		toClick(l.getBtnLogin());
		toQuit();

	}

	@Test
	public void test3() {
		
		  launchBrowser();
		  loadUrl("https://www.facebook.com/login/");
		  maximaize();
		 
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "selva1234@gmail.com");
		fill(l.getTxtpass(), "selvadhh");
		toClick(l.getBtnLogin());
		toQuit();
	}

}
