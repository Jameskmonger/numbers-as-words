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
		return null;
	}
	
}
