package main.java.translators;

public class SingleDigitTranslator implements NumberTranslator {

	static final String[] DIGITS = {
		"one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine"
	};
	
	@Override
	public String translateNumber(int number) {
		if (number < 1 || number > 9) {
			throw new UnsupportedOperationException(
				"translateNumber can only be applied to numbers 1-9."
			);
		}
		
		return DIGITS[number - 1];
	}

}
