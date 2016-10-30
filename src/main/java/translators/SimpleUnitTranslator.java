package main.java.translators;

public class SimpleUnitTranslator implements NumberTranslator {

	static final String[] DIGITS = {
		"zero", "one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine", "ten", "eleven",
		"twelve", "thirteen", "fourteen", "fifteen",
		"sixteen", "seventeen", "eighteen", "nineteen"
	};
	
	public boolean canTranslate(int number) {
		return (number >= 0 && number <= 19);
	}
	
	public String translateNumber(int number) {
		if (!this.canTranslate(number)) {
			throw new UnsupportedOperationException(
				"translateNumber can only be applied to numbers 0-19."
			);
		}
		
		return DIGITS[number];
	}

}
