package com.groups;

import org.testng.annotations.Test;

public class GroupingTests {
	@Test(groups = { "login", "chrome" })
	public void ValidLogin() {
		System.out.println("ValidLogin");

	}

	@Test(groups = { "login", "firefox" })
	public void InValidLogin() {
		System.out.println("InValidLogin()");

	}

	@Test(groups = "login")
	public void EmptyPasswordLogin() {
		System.out.println("EmptyPasswordLogin");

	}

	@Test(groups = "FT")
	public void FundTransfer() {
		System.out.println("FundTransfer");

	}

}