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
	
	@Test
	public void salaryEqual400kBahtShouldHaveTax7500Baht() {
		double expectedResult = 17500;
		Tax tax = new Tax();
		double actualTax = tax.compute(400000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual600kBahtShouldHaveTax42500Baht() {
		double expectedResult = 42500;
		Tax tax = new Tax();
		double actualTax = tax.compute(600000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual750kBahtShouldHaveTax65000Baht() {
		double expectedResult = 65000;
		Tax tax = new Tax();
		double actualTax = tax.compute(750000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual900kBahtShouldHaveTax95000Baht() {
		double expectedResult = 95000;
		Tax tax = new Tax();
		double actualTax = tax.compute(900000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual1mBahtShouldHaveTax115000Baht() {
		double expectedResult = 115000;
		Tax tax = new Tax();
		double actualTax = tax.compute(1000000);
		assertEquals(expectedResult, actualTax, 2);
	}

}
