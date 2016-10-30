package test.java.translators.BelowHundredTranslator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.translators.*;
import test.java.translators.MockSimpleUnitTranslator;

public class CanTranslateTest {

	private BelowHundredTranslator instance;
	private MockSimpleUnitTranslator simpleUnitTranslator;
	
	@Before
	public void setUp() throws Exception {
		this.simpleUnitTranslator = new MockSimpleUnitTranslator();
		this.instance = new BelowHundredTranslator(simpleUnitTranslator);
	}

	@Test
	public void shouldReturnTrueIfSimpleUnitTranslatorReturnsTrue() {
		this.simpleUnitTranslator.setCanTranslateValue(true);
		
		assertEquals(true, this.instance.canTranslate(1));
		assertEquals(true, this.instance.canTranslate(5));
		assertEquals(true, this.instance.canTranslate(200));
	}
	
	@Test
	public void shouldReturnTrueForNonMultiplesOfTen() {
		assertEquals(true, this.instance.canTranslate(25));
		assertEquals(true, this.instance.canTranslate(55));
		assertEquals(true, this.instance.canTranslate(72));
	}

}
