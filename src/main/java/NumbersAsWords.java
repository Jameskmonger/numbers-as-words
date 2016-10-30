package main.java;

import main.java.translators.BelowHundredTranslator;
import main.java.translators.NumberTranslator;
import main.java.translators.SimpleUnitTranslator;

public class NumbersAsWords {
	
	private NumberTranslator belowHundredTranslator;
	
	public NumbersAsWords () {
		this.belowHundredTranslator = new BelowHundredTranslator(
					new SimpleUnitTranslator()
				);
	}

	public String translateNumber(int input) {
		this.checkNumberBounds(input);
		
		if (this.belowHundredTranslator.canTranslate(input)) {
			return this.belowHundredTranslator.translateNumber(input);
		}
		
		// if the value is below 1000 then pass it down to be calculated as a "hundreds"
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
	
}
