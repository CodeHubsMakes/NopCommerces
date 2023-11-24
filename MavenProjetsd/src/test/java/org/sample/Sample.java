package org.sample;

import org.baseclass.BaseClass;

import org.pojo.LoginPojo;
import org.testng.annotations.Test;

public class Sample extends BaseClass {

@Test
	public void Login() {
		
		launchBrowser();

		loadUrl("URL");
		maximaize();

		toCurrentUrl();
		toTitle();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "maheshkumar");
		fill(l.getTxtpass(), "mahesh@123");

		toClick(l.getBtnLogin());
		 
	}

}
