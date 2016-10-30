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
	public void shouldReturnTrueFor0() {
		assertEquals(true, this.instance.canTranslate(0));
	}
	
	@Test
	public void shouldReturnTrueFor10() {
		assertEquals(true, this.instance.canTranslate(10));
	}
	
	@Test
	public void shouldReturnTrueFor15() {
		assertEquals(true, this.instance.canTranslate(15));
	}
	
	@Test
	public void shouldReturnTrueFor19() {
		assertEquals(true, this.instance.canTranslate(19));
	}
	
	@Test
	public void shouldReturnFalseForNegative5() {
		assertEquals(false, this.instance.canTranslate(-5));
	}
	
	@Test
	public void shouldReturnTrueFor20() {
		assertEquals(true, this.instance.canTranslate(20));
	}
	
	@Test
	public void shouldReturnTrueFor30() {
		assertEquals(true, this.instance.canTranslate(30));
	}
	
	@Test
	public void shouldReturnTrueFor40() {
		assertEquals(true, this.instance.canTranslate(40));
	}
	
	@Test
	public void shouldReturnTrueFor50() {
		assertEquals(true, this.instance.canTranslate(50));
	}
	
	@Test
	public void shouldReturnTrueFor60() {
		assertEquals(true, this.instance.canTranslate(60));
	}
	
	@Test
	public void shouldReturnTrueFor70() {
		assertEquals(true, this.instance.canTranslate(70));
	}
	
	@Test
	public void shouldReturnTrueFor80() {
		assertEquals(true, this.instance.canTranslate(80));
	}
	
	@Test
	public void shouldReturnTrueFor90() {
		assertEquals(true, this.instance.canTranslate(90));
	}
	
	@Test
	public void shouldReturnFalseForNonTenNumbers() {
		assertEquals(false, this.instance.canTranslate(25));
		assertEquals(false, this.instance.canTranslate(45));
		assertEquals(false, this.instance.canTranslate(55));
		assertEquals(false, this.instance.canTranslate(95));
	}

}
