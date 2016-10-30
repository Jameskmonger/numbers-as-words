package main.java.translators;

public class BelowHundredTranslator implements NumberTranslator {

	private NumberTranslator simpleUnitTranslator;
	
	public BelowHundredTranslator (NumberTranslator simpleUnitTranslator) {
		this.simpleUnitTranslator = simpleUnitTranslator;
	}

	@Override
	public boolean canTranslate(int number) {
		// if the simple translator can translate it then we definitely can
		if (this.simpleUnitTranslator.canTranslate(number)) {
			return true;
		}
		
		// otherwise just check it's above or equal to 0 and below 100
		return (number >= 0 && number < 100);
	}

	@Override
	public String translateNumber(int number) {
		if (this.simpleUnitTranslator.canTranslate(number)) {
			return this.simpleUnitTranslator.translateNumber(number);
		}
		
		// if it's less than 100, divide by 10 and go from there
		int base10 = number / 10;
		int mod10 = number % 10;
					
		// multiply the base 10 up so we get 90 and 1 from 91
		return this.translateNumber(base10 * 10) 
		   	+ " " + this.translateNumber(mod10);
	}
	
}
