package demo.testing;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class MyTaxTest {
	
	@Test
	public void salaryEqual0kBahtShouldNotHaveTax() {
		double expectedResult = 0;
		Tax tax = new Tax();
		double actualTax = tax.compute(0);
		assertEquals(expectedResult, actualTax, 2);
	}

	@Test
	public void salaryEqual150kBahtShouldNotHaveTax() {
		double expectedResult = 0;
		Tax tax = new Tax();
		double actualTax = tax.compute(150000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual200kBahtShouldHaveTax2500Baht() {
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
	
	@Test
	public void salaryEqual2mBahtShouldHaveTax365000Baht() {
		double expectedResult = 365000;
		Tax tax = new Tax();
		double actualTax = tax.compute(2000000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual3mBahtShouldHaveTax665000Baht() {
		double expectedResult = 665000;
		Tax tax = new Tax();
		double actualTax = tax.compute(3000000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual4mBahtShouldHaveTax965000Baht() {
		double expectedResult = 965000;
		Tax tax = new Tax();
		double actualTax = tax.compute(4000000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual5mBahtShouldHaveTax1315000Baht() {
		double expectedResult = 1315000;
		Tax tax = new Tax();
		double actualTax = tax.compute(5000000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void salaryEqual50mBahtShouldHaveTax3065000Baht() {
		double expectedResult = 3065000;
		Tax tax = new Tax();
		double actualTax = tax.compute(10000000);
		assertEquals(expectedResult, actualTax, 2);
	}
	
	@Test
	public void testNumberFormat2pointAfter() throws Exception {
		TaxController taxController = new TaxController();
		String output = taxController.formatOutput(0.05);
		assertEquals("0.05", output);
	}

}
