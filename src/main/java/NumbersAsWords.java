package main.java;

import main.java.translators.NumberTranslator;
import main.java.translators.SimpleUnitTranslator;

public class NumbersAsWords {
	
	private NumberTranslator simpleUnitTranslator;
	
	public NumbersAsWords () {
		this.simpleUnitTranslator = new SimpleUnitTranslator();
	}

	public String translateNumber(int input) {
		this.checkNumberBounds(input);
		
		if (this.simpleUnitTranslator.canTranslate(input)) {
			return this.simpleUnitTranslator.translateNumber(input);
		}
		
		String valueBelowHundred = this.calculateBelowHundred(input);
		if (valueBelowHundred != null) {
			return valueBelowHundred;
		}
		
		if (input < 1000) {
			return this.calculateLargerValue(
				"hundred",
				input,
				100,
				true
			);
		}
		
		if (input < 1000000) {
			return this.calculateLargerValue(
				"thousand",
				input,
				1000,
				false
			);
		}
		
		return this.calculateLargerValue(
			"million",
			input,
			1000000,
			false
		);
	}
	
	private void checkNumberBounds(int input) {
		if (input < 0) {
			throw new UnsupportedOperationException(
				"translateNumber cannot be applied on negative numbers."
			);
		}
		
		if (input > 999999999) {
			throw new UnsupportedOperationException(
				"translateNumber cannot be applied on numbers larger than 999999999."
			);
		}
	}
	
	private String calculateLargerValue(String level, int input, int base, boolean useAnd) {
		int baseValue = input / base;
		int modValue = input % base;
		
		String result = this.translateNumber(baseValue) + " " + level;
		
		// if there is a modulus left, we need to translate that too
		if (modValue != 0) {
			// see if we need to use "and" or not
			if (useAnd) {
				result = result + " and " + this.translateNumber(modValue);
			} else {
				result = result + " " + this.translateNumber(modValue);
			}			
		}
		
		return result;
	}
	
	private String calculateBelowHundred(int input) {
		// if it's less than 100, divide by 10 and go from there
		int base10 = input / 10;
		int mod10 = input % 10;
				
		if (input < 100) {
			// multiply the base 10 up so we get 90 and 1 from 91
		    return this.translateNumber(base10 * 10) 
		    	+ " " + this.translateNumber(mod10); 
		}
		
		// return null if we can't do anything
		return null;
	}
	
}
