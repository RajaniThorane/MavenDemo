package com.testshastra.unittests;

import org.testng.annotations.Test;

public class SignupTests {
	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("i am m1 of smoke");
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
