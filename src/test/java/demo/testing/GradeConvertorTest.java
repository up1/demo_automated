package demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeConvertorTest {
	
	@Test
	public void whenISendScore80ThenReturnGradeA() throws Exception {
		
		GraderConvertor convertor = new GraderConvertor();
		String grade = convertor.convert(80);
		
		assertEquals("A", grade);
		
	}
	
	@Test
	public void whenISendScrore101ThenReturnGradeUnknow() {

		GraderConvertor convertor = new GraderConvertor();
		String grade = convertor.convert( 101 );

		assertEquals( "Unknow", grade );

		}

}
