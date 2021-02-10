package com.testshastra.unittests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("i am m1 of smoke");
		String env = System.getProperty("env");
		System.out.println("executing test on" + env + "environment");

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

	}

	@Test(groups = "Regression")
	public void m2() {
		System.out.println("i am m2 of regression");
	}

	@Test(groups = "Regression")
	public void m3() {
		System.out.println("i am m3 of regression");
	}

	@Test(groups = "smoke")
	public void m4() {
		System.out.println("i am m4 of smoke");
	}

	@Test(groups = "Regression")
	public void m5() {
		System.out.println("i am m5 of regression");
	}
}
