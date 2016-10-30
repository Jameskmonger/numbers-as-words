package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.NumbersAsWords;

/**
 * End to end tests for the behaviour of the program.
 */

public class NumbersAsWordsTest {

	private NumbersAsWords instance;
	
	@Before
	public void setUp() {
		this.instance = new NumbersAsWords();
	}
	
	private static boolean checkNegativeNumberException(Exception e) {
		final String message = "translateNumber cannot be applied on negative numbers.";
		
		return e.getMessage().equals(message);
	}
	
	private static boolean checkTooLargeException(Exception e) {
		final String message = "translateNumber cannot be applied on numbers larger than 999999999.";
		
		return e.getMessage().equals(message);
	}
	
	@Test
	public void shouldThrowForNegative1() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(-1);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkNegativeNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowForNegative10() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(-10);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkNegativeNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowForNegative100() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(-100);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkNegativeNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowForNegative500000() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(-500000);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkNegativeNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowFor1000000099() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(1000000099);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkTooLargeException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowFor1100000099() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(1100000099);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkTooLargeException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldTranslate0Correctly() {
		assertEquals("zero", this.instance.translateNumber(0));
	}
	
	@Test
	public void shouldTranslate1Correctly() {
		assertEquals("one", this.instance.translateNumber(1));
	}

	@Test
	public void shouldTranslate10Correctly() {
		assertEquals("ten", this.instance.translateNumber(10));
	}
	
	@Test
	public void shouldTranslate21Correctly() {
		assertEquals("twenty one", this.instance.translateNumber(21));
	}
	
	@Test
	public void shouldTranslate95Correctly() {
		assertEquals("ninety five", this.instance.translateNumber(95));
	}
	
	@Test
	public void shouldTranslate56945781Correctly() {
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", 
				this.instance.translateNumber(56945781));
	}
	
	@Test
	public void shouldTranslate999999999Correctly() {
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				this.instance.translateNumber(999999999));
	}

}
