package test.java.translators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.translators.SingleDigitTranslator;

public class SingleDigitTranslatorTest {

	private SingleDigitTranslator instance;
	
	@Before
	public void setUp() throws Exception {
		this.instance = new SingleDigitTranslator();
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

}
