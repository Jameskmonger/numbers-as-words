package main.java;

import main.java.translators.NumberTranslator;
import main.java.translators.SimpleUnitTranslator;

public class NumbersAsWords {
	
	private final String ZERO = "zero";
	private NumberTranslator simpleUnitTranslator;
	
	public NumbersAsWords () {
		this.simpleUnitTranslator = new SimpleUnitTranslator();
	}

	public String translateNumber(int input) {
		if (input == 0) {
			return this.ZERO;
		}
		
		if (input > 0 && input < 10) {
			return this.simpleUnitTranslator.translateNumber(input);
		}
		
		return "";
	}
	
}
