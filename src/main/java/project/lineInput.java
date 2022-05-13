package project;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public abstract class lineInput {
	
	private static int numbersOfLines = 0;
	private int index;
	
	private JLabel label;
	private JTextField textfield;
	private JLabel unit;
	
	public lineInput(String label, String unit, int boundX, int boundY, JPanel panel) {
		this.setLabel(new JLabel(label));
		this.setTextfield(new JTextField());
		this.unit = new JLabel(unit);
		
		this.setIndex(numbersOfLines);
		numbersOfLines = numbersOfLines+1;
		
		getTextfield().setHorizontalAlignment(JTextField.RIGHT);
	
		this.getLabel().setBounds(boundX, boundY, 400, 50);
		this.getTextfield().setBounds(boundX + 270, boundY + 16, 60, 20);
		this.unit.setBounds(boundX + 330, boundY, 400, 50);
	
		panel.add(this.getLabel());
		panel.add(this.getTextfield());
		panel.add(this.unit);
	}
	
	abstract void checkinput() throws LessThanZeroException, MoneyInputException, PercentException, WholeNumberException;

	public JTextField getTextfield() {
		return textfield;
	}

	public void setTextfield(JTextField textfield) {
		this.textfield = textfield;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
