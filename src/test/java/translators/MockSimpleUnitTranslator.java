package test.java.translators;

import main.java.translators.NumberTranslator;

public class MockSimpleUnitTranslator implements NumberTranslator {

	private boolean canTranslateValue;
	private String translateNumberValue;
	
	public void setCanTranslateValue(boolean value) {
		this.canTranslateValue = value;
	}
	
	public void setTranslateNumberValue(String value) {
		this.translateNumberValue = value;
	}
	
	public boolean canTranslate(int number) {
		return this.canTranslateValue;
	}

	public String translateNumber(int number) {
		return this.translateNumberValue;
	}
	
}
