package test.java.translators;

import main.java.translators.NumberTranslator;

public class MockSimpleUnitTranslator implements NumberTranslator {

	private boolean canTranslateValue;
	
	public void setCanTranslateValue(boolean value) {
		this.canTranslateValue = value;
	}
	
	public boolean canTranslate(int number) {
		return this.canTranslateValue;
	}

	public String translateNumber(int number) {
		return null;
	}
	
}
