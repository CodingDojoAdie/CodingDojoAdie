import static org.junit.Assert.*;

import org.junit.Test;

public class UT_FizzBuzzTest {

	@Test
	public void isMultiple3() {
		assertTrue(FizzBuzz.isMultiple3(3));
	}
	
	@Test
	public void isMultiple3Failed() {
		assertFalse(FizzBuzz.isMultiple3(2));
	}
	
	@Test
	public void isMultiple5() {
		assertTrue(FizzBuzz.isMultiple5(5));
	}
	
	@Test
	public void isMultiple5Failed() {
		assertFalse(FizzBuzz.isMultiple5(2));
	}
	
	@Test
	public void fizz() {
		assertEquals("Fizz", FizzBuzz.write(3));
	}
	
	@Test
	public void buzz() {
		assertEquals("Buzz", FizzBuzz.write(5));
	}

	@Test
	public void return1for1() {
		assertEquals("1", FizzBuzz.write(1));
	}
	
	@Test
	public void fizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.write(15));
	}
	
}
