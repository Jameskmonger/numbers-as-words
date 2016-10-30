package main.java.translators;

public class SimpleUnitTranslator implements NumberTranslator {

	static final String[] DIGITS = {
		"one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine"
	};
	
	public boolean canTranslate(int number) {
		return (number >= 1 && number <= 9);
	}
	
	public String translateNumber(int number) {
		if (!this.canTranslate(number)) {
			throw new UnsupportedOperationException(
				"translateNumber can only be applied to numbers 1-9."
			);
		}
		
		return DIGITS[number - 1];
	}

}
