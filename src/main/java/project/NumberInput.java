package project;

import javax.swing.JPanel;


public final class NumberInput extends lineInput {
	
	public NumberInput(String label, String unit, int boundX, int boundY, JPanel panel) {
		super(label, unit, boundX, boundY, panel);
}
	
	@Override
	public void checkinput() throws LessThanZeroException, MoneyInputException, PercentException{
		
		Double value = Double.parseDouble(getTextfield().getText());
		
		if (value < 0) {
			throw new LessThanZeroException();
		}
		
		String[] dstring = value.toString().split("\\.");
		if (dstring[1].length() > 2) {
			throw new MoneyInputException();
		}
	}
}
