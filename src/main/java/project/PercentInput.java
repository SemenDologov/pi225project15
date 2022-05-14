package project;

import javax.swing.JPanel;


public final class PercentInput extends lineInput {
	
	public PercentInput(String label, String unit, int boundX, int boundY, JPanel panel) {
		super(label, unit, boundX, boundY, panel);
	}

	@Override
	public void checkinput() throws LessThanZeroException, PercentException, WholeNumberException {
		
		Double value = Double.parseDouble(getTextfield().getText());
		
		if (value < 0) {
			throw new LessThanZeroException();
		}
		if (value > 100) {
			throw new PercentException();
		}
		if (value % 1 !=0) {
			throw new WholeNumberException();
		}
	}
}