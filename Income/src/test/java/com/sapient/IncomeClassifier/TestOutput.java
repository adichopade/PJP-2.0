package com.sapient.IncomeClassifier;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

public class TestOutput {
	
	@Test(priority=1)
	public void testIndiaFemale() throws FilloException {
		
		Controller con = new Controller();
		
		AverageIncome avg = con.averageController().get(0);
		
		float res = avg.getAverage_Income();
		System.out.println(res);
		Assert.assertEquals(2392.2456, res);
	}

}
