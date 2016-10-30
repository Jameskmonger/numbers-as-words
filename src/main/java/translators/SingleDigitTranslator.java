package main.java.translators;

public class SingleDigitTranslator implements NumberTranslator {

	static final String[] DIGITS = {
		"one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine"
	};
	
	@Override
	public String translateNumber(int number) {
		return DIGITS[number - 1];
	}

}
