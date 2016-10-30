package test.java.translators.SimpleUnitTranslator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.translators.SimpleUnitTranslator;

public class CanTranslateTest {

	private SimpleUnitTranslator instance;
	
	@Before
	public void setUp() throws Exception {
		this.instance = new SimpleUnitTranslator();
	}

	@Test
	public void shouldReturnTrueFor1() {
		assertEquals(true, this.instance.canTranslate(1));
	}
	
	@Test
	public void shouldReturnTrueFor2() {
		assertEquals(true, this.instance.canTranslate(2));
	}

	@Test
	public void shouldReturnTrueFor3() {
		assertEquals(true, this.instance.canTranslate(3));
	}
	
	@Test
	public void shouldReturnTrueFor4() {
		assertEquals(true, this.instance.canTranslate(4));
	}
	
	@Test
	public void shouldReturnTrueFor5() {
		assertEquals(true, this.instance.canTranslate(5));
	}
	
	@Test
	public void shouldReturnTrueFor6() {
		assertEquals(true, this.instance.canTranslate(6));
	}
	
	@Test
	public void shouldReturnTrueFor7() {
		assertEquals(true, this.instance.canTranslate(7));
	}
	
	@Test
	public void shouldReturnTrueFor8() {
		assertEquals(true, this.instance.canTranslate(8));
	}
	
	@Test
	public void shouldReturnTrueFor9() {
		assertEquals(true, this.instance.canTranslate(9));
	}
	
	@Test
	public void shouldReturnFalseFor0() {
		assertEquals(false, this.instance.canTranslate(0));
	}
	
	@Test
	public void shouldReturnFalseFor10() {
		assertEquals(false, this.instance.canTranslate(10));
	}

}
