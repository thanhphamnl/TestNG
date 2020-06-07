package com.groups;

import org.testng.annotations.Test;

@Test
public class Test1 {
	@Test(groups = { "windows.checkintest" })
	public void testWindowsOnly() {
		System.out.println("windows.checkintest");
	}

	@Test(groups = { "linux.checkintest" })
	public void testLinuxOnly() {
	}

	@Test(groups = { "windows.functest" })
	public void testWindowsToo() {
		System.out.println("windows.functest");
	}
}
