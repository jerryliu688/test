package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups = "GR")
	public void testGR3() {
		System.out.println("GR3");
		Assert.assertEquals(1, 1);
	}

}
