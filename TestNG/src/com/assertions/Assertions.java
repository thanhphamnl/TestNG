package com.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	SoftAssert soft = new SoftAssert();
	WebDriver driver;

	@Test
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "Launch" })
	public void Facebook() {
		driver.get("https://www.facebook.com");
		soft.assertEquals("FB Title", driver.getTitle());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "Facebook" })
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		soft.assertAll();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/*
 * SoftAssert in TestNG helps to collect all the assertions throughout the @Test method. And to see assertions result at the end of the test, we have to invoke assertAll().

SoftAssert don't throw an exception when an assert fails. The test execution will continue with the next step after the assert statement.

If we use normal asserts like Assert.assertTrue() or Assert.assertEquals() in TestNG, @Test Method will immediately fail after any of the Asserts fails.
 * */
