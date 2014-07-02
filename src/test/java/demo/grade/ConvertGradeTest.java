package demo.grade;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertGradeTest {

	@Test
	public void score80GetGradeA() throws Exception {
		Grade grade = new Grade();
		assertEquals("A", grade.convert(80));
	}
	
}
