package project;

public final class WholeNumberInput extends lineInput{
	
	private String label;
	
	public WholeNumberInput(String label) {
		super(label);
		setLabel(label);
	}

	@Override
	void checkinput() throws WholeNumberException {
		
		Double value = Double.parseDouble(getLabel());
		
		if (value % 1 !=0) {
			throw new WholeNumberException();
		}
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}