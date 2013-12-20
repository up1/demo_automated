package demo.testing;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class KBankTest {
	GradeCoverter gradeCoverter;
	
	@Before
	public void setup() {
		gradeCoverter = new GradeCoverter();
	}
	
	@Test
	public void checkScoreMoreThan100OrLessThanZeroShouldShowErrorMessage(){
		String result = gradeCoverter.convert(-1);
		Assert.assertEquals("Unknown", result);
		
		result = gradeCoverter.convert(101);
		Assert.assertEquals("Unknown", result);
	}
	
	@Test
	public void scoreMoreThan69ShouldGetGradeB() throws Exception {
		Assert.assertEquals("B", gradeCoverter.convert(70));
		Assert.assertEquals("C", gradeCoverter.convert(60));
		Assert.assertEquals("D", gradeCoverter.convert(50));
	}
}
