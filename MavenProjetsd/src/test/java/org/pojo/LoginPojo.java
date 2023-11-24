package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);

	}


		@FindBys ({

			@FindBy(xpath ="//input[@id='email']"),  //true
			@FindBy(xpath ="//input[@name='email']") //true


		})
		private WebElement txtEmail;

		@FindAll({

			@FindBy(xpath ="//input[@id='pass']"), //false
			@FindBy(xpath ="//input[@name='pass']") //true

		})

		//@FindBy(id="email")
		//private WebElement txtEmail;

		// @FindBy(id="pass")
		private WebElement txtpass;

		@FindBy(name = "login")
		private WebElement BtnLogin;

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getBtnLogin() {
			return BtnLogin;
		}

	}
