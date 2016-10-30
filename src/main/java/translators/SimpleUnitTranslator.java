package main.java.translators;

public class SimpleUnitTranslator implements NumberTranslator {
	
	final String[] DIGITS = new String[91];
	
	public SimpleUnitTranslator () {
		this.populateDigits();
	}
	
	public boolean canTranslate(int number) {
		return (number >= 0 && number <= 90 && this.DIGITS[number] != null);
	}
	
	public String translateNumber(int number) {
		if (!this.canTranslate(number)) {
			throw new UnsupportedOperationException(
				"translateNumber can only be applied to numbers 0-19, and multiples of 10 between 20 and 90."
			);
		}
		
		return this.DIGITS[number];
	}
	
	private void populateDigits() {
		this.DIGITS[0] = "zero";
		this.DIGITS[1] = "one";
		this.DIGITS[2] = "two";
		this.DIGITS[3] = "three";
		this.DIGITS[4] = "four";
		this.DIGITS[5] = "five";
		this.DIGITS[6] = "six";
		this.DIGITS[7] = "seven";
		this.DIGITS[8] = "eight";
		this.DIGITS[9] = "nine";
		this.DIGITS[10] = "ten";
		this.DIGITS[11] = "eleven";
		this.DIGITS[12] = "twelve";
		this.DIGITS[13] = "thirteen";
		this.DIGITS[14] = "fourteen";
		this.DIGITS[15] = "fifteen";
		this.DIGITS[16] = "sixteen";
		this.DIGITS[17] = "seventeen";
		this.DIGITS[18] = "eighteen";
		this.DIGITS[19] = "nineteen";
		this.DIGITS[20] = "twenty";
		this.DIGITS[30] = "thirty";
		this.DIGITS[40] = "forty";
		this.DIGITS[50] = "fifty";
		this.DIGITS[60] = "sixty";
		this.DIGITS[70] = "seventy";
		this.DIGITS[80] = "eighty";
		this.DIGITS[90] = "ninety";
	}

}
