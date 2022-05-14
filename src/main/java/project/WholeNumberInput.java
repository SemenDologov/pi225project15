package project;

import javax.swing.JPanel;


public final class WholeNumberInput extends lineInput{
	
	public WholeNumberInput(String label, String unit, int boundX, int boundY, JPanel panel) {
		super(label, unit, boundX, boundY, panel);
	}

	@Override
	void checkinput() throws WholeNumberException {
		
		Double value = Double.parseDouble(getTextfield().getText());
		
		if (value % 1 !=0) {
			throw new WholeNumberException();
		}
	}

}