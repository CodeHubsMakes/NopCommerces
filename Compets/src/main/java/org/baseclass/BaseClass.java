package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert A;
	public static JavascriptExecutor js;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximaize() {
		driver.manage().window().maximize();
	}

	public static void toCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void toTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void fill(WebElement element, String userText) {
		element.sendKeys(userText);

	}

	public static void toClick(WebElement element) {
		element.click();

	}

	public static void totext(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void toAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}

	public static void toQuit() {
		driver.quit();

	}

	public static void toPerformMoveToElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void toPerformDoubleClick() {
		a.doubleClick().perform();

	}

	public static void toPerformContextClick() {
		a.contextClick().perform();

	}

	public static void toPerformKeyDown() {
		a.keyDown(null).perform();

	}

	public static void toPerformKeyUp() {
		a.keyUp(null).perform();

	}

	public static void toClickAndHold() {
		a.clickAndHold().perform();
	}

	public static void toPerformRelease() {
		a.release().perform();

	}

	public static void toRobTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void toUp() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void toAll() {
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

	}

	public static void toCopy() {
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void toShift() {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void toControl() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toAlertDismiss() {
		driver.switchTo().alert().dismiss();

	}

	public static void toAlertAccept() {
		driver.switchTo().alert().accept();

	}

	public static void toAlertSendKeys() {
		driver.switchTo().alert().sendKeys("String");

	}

	public static void toAlertGetText() {
		driver.switchTo().alert().getText();

	}

	public static void toTakesScreenShot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screen = tk.getScreenshotAs(OutputType.FILE);
		File shotAs = new File("E:\\New folder\\silini new text\\Mavenproje\\execelsheets\\ml.png");
		FileUtils.copyFile(screen, shotAs);
	}

	public static void toJavaScriptExecutor() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','String value')", "refName");
		Object sc = js.executeScript("return arguments[0].getAttribute('value')", "refName");
		String s = (String) sc;
		System.out.println(s);
	}

	public static void toJavaClick() {
		js.executeScript("arguments[0].click", "ref name");

	}

	public static void toScrollDown() {
		js.executeScript("arguments[0].scrollIntoView(true)", "refName");

	}

	public static void toScrollUP() {
		js.executeScript("arguments[0].scrollIntoView(false)", "refName");

	}

	public static void toFreamIdName() {
		driver.switchTo().frame("nameOrId");

	}

	public static void toFrameIndex() {
		driver.switchTo().frame("indexNo");
	}

	public static void toFrameWebelement() {
		driver.switchTo().frame("RefName");
	}

	public static void toParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void toDefaultContent() {
		driver.switchTo().defaultContent();

	}

	public static void toWindowHandles() {
		driver.getWindowHandles();
	}

	public static void towindowHandle() {
		driver.getWindowHandle();

	}

	public static void toWindow() {
		driver.switchTo().window("String nameOrHandle");

	}

	public static void toWait() {
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void Select(WebElement element) {
		s = new Select(element);

	}
	

	public static void SelectIndox() {
		s.selectByIndex(3);

	}

	public static String excelRead(String SheetName, int rowNo, int cellNo) throws IOException {

		File f = new File("Url");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);

		Sheet sheet = book.getSheet(SheetName);

		Row r = sheet.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int cellType = c.getCellType();

		String value = "";

		if (cellType == 1) {
			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();

			SimpleDateFormat sim = new SimpleDateFormat("DD-MM-YYYY");
			value = sim.format(d);

		} else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);
		}

		return value;

	}

}
