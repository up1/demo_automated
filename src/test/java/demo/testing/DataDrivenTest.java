package demo.testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DataDrivenTest {

	private int score;
	private String grade;
	
	public DataDrivenTest(int score, String grade) {
		this.score = score;
		this.grade = grade;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 80, "A" }, { 70, "B" }, { 60, "C" }, { 50, "D" } };
		return Arrays.asList(data);
	}
	
	Grade gradeObject = new Grade();

	@Test
	public void testConvertScoreToGrade() throws Exception {
		String result = gradeObject.calculate(score);
		Assert.assertEquals(grade, result );
	}

}
