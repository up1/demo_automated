package demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTaxTest {

	@Test
	public void salaryEqual150kBAHTShouldNotHaveTax() {
		double expectedResult = 0;
		Tax tax = new Tax();
		double actualTax = tax.compute(150000);
		assertEquals(expectedResult, actualTax);
	}

}
