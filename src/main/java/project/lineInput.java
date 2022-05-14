package project;

public abstract class lineInput {
	
	private String label;
	
	public lineInput(String label) {
		setLabel(label);
	}
	
	abstract void checkinput() throws LessThanZeroException, MoneyInputException, PercentException, WholeNumberException;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	
}

