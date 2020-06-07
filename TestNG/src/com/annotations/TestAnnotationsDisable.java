package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotationsDisable {
	
	   @Test(enabled = false)
	    public void Login() {
	        System.out.println("Test1");
	    }
	   
	}
	

