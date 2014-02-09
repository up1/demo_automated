package demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void test1ShouldShow1() throws Exception {
		String result = fizzBuzz.shout(1);
		assertEquals("1",result);
	}

	@Test
	public void test2ShouldShow2() throws Exception {
		String result = fizzBuzz.shout(2);
		assertEquals("2",result);
	}

	@Test
	public void test3ShouldShowFizz() throws Exception {
		String result = fizzBuzz.shout(3);
		assertEquals("Fizz",result);
	}

	@Test
	public void test5ShouldShowBuzz() throws Exception {
		String result = fizzBuzz.shout(5);
		assertEquals("Buzz",result);
	}


}
