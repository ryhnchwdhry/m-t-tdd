package com.mtb.qa.test;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoClass extends BaseClass {

	@Test
	public void homepageSteps() {
		homePage.homepageSteps("123","123456", "09/01/99");
	

	}

}
