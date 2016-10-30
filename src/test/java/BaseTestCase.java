package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Base;

public class BaseTestCase {

	private Base base;
	
	@Before
	public void setUp() {
		this.base = new Base();
	}
	
	@Test
	public void shouldGiveFiveForFour() {
		assertEquals(5, this.base.getNumber(4));
	}
	
	@Test
	public void shouldGiveTenForNine() {
		assertEquals(10, this.base.getNumber(9));
	}

}
