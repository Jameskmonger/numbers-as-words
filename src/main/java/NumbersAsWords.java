package main.java;

import main.java.translators.NumberTranslator;
import main.java.translators.SimpleUnitTranslator;

public class NumbersAsWords {
	
	private NumberTranslator simpleUnitTranslator;
	
	public NumbersAsWords () {
		this.simpleUnitTranslator = new SimpleUnitTranslator();
	}

	public String translateNumber(int input) {
		if (this.simpleUnitTranslator.canTranslate(input)) {
			return this.simpleUnitTranslator.translateNumber(input);
		}
		
		return "";
	}
	
}
