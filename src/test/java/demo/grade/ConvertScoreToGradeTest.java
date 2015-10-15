package demo.grade;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertScoreToGradeTest {

	@Test
	public void shouldGetGradeA_WhenScoreIs81() {
		MyGrade myGrade = new MyGrade();
		String expectedGrade = myGrade.convert(81);
		assertEquals("A", expectedGrade);
	}
	
}
