package test.java.translators.SimpleUnitTranslator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.translators.SimpleUnitTranslator;

public class TranslateNumberTest {

	private SimpleUnitTranslator instance;
	
	@Before
	public void setUp() throws Exception {
		this.instance = new SimpleUnitTranslator();
	}

	private static boolean checkOutOfBoundsNumberException(Exception e) {
		final String message = "translateNumber can only be applied to numbers 1-9.";
		
		return e.getMessage().equals(message);
	}
	
	@Test
	public void shouldTranslate1Correctly() {
		assertEquals("one", this.instance.translateNumber(1));
	}
	
	@Test
	public void shouldTranslate2Correctly() {
		assertEquals("two", this.instance.translateNumber(2));
	}

	@Test
	public void shouldTranslate3Correctly() {
		assertEquals("three", this.instance.translateNumber(3));
	}
	
	@Test
	public void shouldTranslate4Correctly() {
		assertEquals("four", this.instance.translateNumber(4));
	}
	
	@Test
	public void shouldTranslate5Correctly() {
		assertEquals("five", this.instance.translateNumber(5));
	}
	
	@Test
	public void shouldTranslate6Correctly() {
		assertEquals("six", this.instance.translateNumber(6));
	}
	
	@Test
	public void shouldTranslate7Correctly() {
		assertEquals("seven", this.instance.translateNumber(7));
	}
	
	@Test
	public void shouldTranslate8Correctly() {
		assertEquals("eight", this.instance.translateNumber(8));
	}
	
	@Test
	public void shouldTranslate9Correctly() {
		assertEquals("nine", this.instance.translateNumber(9));
	}
	
	@Test
	public void shouldThrowForLowerThan1() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(0);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkOutOfBoundsNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}
	
	@Test
	public void shouldThrowForGreaterThan9() {
		boolean correctExceptionThrown = false;
		
		try {
			this.instance.translateNumber(10);			
		} catch (UnsupportedOperationException e) {
			correctExceptionThrown = checkOutOfBoundsNumberException(e);
		}
		
		if (!correctExceptionThrown) {
			fail("Expected UnsupportedOperationException to be thrown.");
		}
	}

}
