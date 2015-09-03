package demo.grade;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertGradeTest {
	
	Grade grade = new Grade();
	
	@Test
	public void shouldGradeA() {
		assertEquals("A", grade.convert(81));
		assertEquals("A", grade.convert(80));
	}
	
	@Test
	public void shouldGradeBWhenScoreIs79() {
		assertEquals("B", grade.convert(79));
	}
	
	@Test
	public void shouldGradeCWhenScoreIs69() {
		assertEquals("C", grade.convert(69));
	}
	
}
