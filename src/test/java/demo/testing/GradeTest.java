package demo.testing;

import org.junit.Assert;
import org.junit.Test;

public class GradeTest {

	Grade grade = new Grade();
	
	String sql =
	"select *        "+
	"   from         "+
	"   where xxxx   ";
	
	
	@Test
	public void scoreLessThan0ShouldSeeError() throws Exception {
		String result = grade.calculate(-1);
		Assert.assertEquals("Error", result);
	}
	
	@Test
	public void scoreMoreThan100ShouldSeeError() throws Exception {
		String result = grade.calculate(101);
		Assert.assertEquals("Error", result);
	}
	
	@Test
	public void scoreMoreThanEqual80ShouldSeeGradeA() throws Exception {
		String result = grade.calculate(80);
		Assert.assertEquals("A", result);
	}
	
	@Test
	public void scoreMoreThanEqual70ShouldSeeGradeB() throws Exception {
		String result = grade.calculate(70);
		Assert.assertEquals("B", result);
	}

}
