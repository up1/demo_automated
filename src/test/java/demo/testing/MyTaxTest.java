package demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTaxTest {

	@Test
	public void salaryEqual150kBahtShouldNotHaveTax() {
		double expectedResult = 0;
		Tax tax = new Tax();
		double actualTax = tax.compute(150000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual200kBahtShouldHaveTax5000Baht() {
		double expectedResult = 2500;
		Tax tax = new Tax();
		double actualTax = tax.compute(200000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual300kBahtShouldHaveTax7500Baht() {
		double expectedResult = 7500;
		Tax tax = new Tax();
		double actualTax = tax.compute(300000);
		assertEquals(expectedResult, actualTax, 2);
	}

}
