package test.java.translators.BelowHundredTranslator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.translators.*;
import test.java.translators.MockSimpleUnitTranslator;

public class TranslateNumberTest {

	private BelowHundredTranslator instance;
	private MockSimpleUnitTranslator simpleUnitTranslator;
	
	@Before
	public void setUp() throws Exception {
		this.simpleUnitTranslator = new MockSimpleUnitTranslator();
		this.instance = new BelowHundredTranslator(simpleUnitTranslator);
	}
	
	@Test
	public void shouldReturnSimpleUnitResultIfCanTranslate() {
		this.simpleUnitTranslator.setCanTranslateValue(true);
		
		this.simpleUnitTranslator.setTranslateNumberValue("bla");
		assertEquals("bla", this.instance.translateNumber(1));
		
		this.simpleUnitTranslator.setTranslateNumberValue("waggawagga");
		assertEquals("waggawagga", this.instance.translateNumber(500));
	}
	
	@Test
	public void shouldReturnCorrectValueFor25() {
		this.instance = new BelowHundredTranslator(new SimpleUnitTranslator());
		
		assertEquals("twenty five", this.instance.translateNumber(25));
	}
	
	@Test
	public void shouldReturnCorrectValueFor53() {
		this.instance = new BelowHundredTranslator(new SimpleUnitTranslator());
		
		assertEquals("fifty three", this.instance.translateNumber(53));
	}

}
