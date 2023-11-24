package org.Junit;

import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.LoginPojo;

public class SampleClass extends BaseClass {

	@BeforeClass

	public static void beforeClass() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass

	public static void aftClass() {

		Date d = new Date();
		System.out.println(d);

	}

	@Before
	public void before() {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		maximaize();

	}

	@After
	public void after() {
		toQuit();

	}

	@Test

	public void test1() {

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "Ashok12344@gmail.com");
		fill(l.getTxtpass(), "Ashok123");
		toClick(l.getBtnLogin());
	}

	@Test
	public void test2() {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "mahesh07ybdv@gmail.com");
		fill(l.getTxtpass(), "maheshdbcnhc");
		toClick(l.getBtnLogin());

	}

	@Test
	public void test3() {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "selva1234@gmail.com");
		fill(l.getTxtpass(), "selvadhh");
		toClick(l.getBtnLogin());

	}

}
