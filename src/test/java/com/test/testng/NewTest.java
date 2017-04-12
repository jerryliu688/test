package com.test.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.commons.lang3.StringUtils;

public class NewTest {

	private WebDriver driver;

	// @Test(groups = "STABLE")
	// public void testEasy() {
	// String id="kw";//lst-ib
	// String input_text="Go Jerry";
	// driver.get("http://www.baidu.com");//https://www.google.com
	// WebElement element = driver.findElement(By.id(id));
	// element.sendKeys(input_text);
	// WebElement element_button = driver.findElement(By.id("su"));
	// String text = element_button.getAttribute("value");
	// Assert.assertTrue(text.contains("百度一下"));
	// WebDriverWait wait = new WebDriverWait(driver, 20);
	// wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	// element= driver.findElement(By.id(id));
	// Assert.assertTrue(element.getAttribute("value").equals((input_text)));
	//
	// }

	@Test(groups = "GR")
	public void testGR1() {
		System.out.println("GR1");
	}

	@Test(groups = "GR")
	public void testGR2() {
		System.out.println("GR2");
	}

	@Test(groups = { "systemtest" })
	public void testLogin() {
		System.out.println("this is test login");
	}

	@Test(groups = { "functiontest" })
	public void testOpenPage() {
		System.out.println("this is test Open Page");
	}

	@BeforeTest
	public void beforeTest() {
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Jerry\\Project\\workspace\\lib\\geckodriver.exe");
		// driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
