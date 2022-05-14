package project;

public final class NumberInput extends lineInput {
	
	private String label;
	
	public NumberInput(String label) {
		super(label);
		setLabel(label);
}
	
	@Override
	public void checkinput() throws LessThanZeroException, MoneyInputException, PercentException{
		
		Double value = Double.parseDouble(label);
		
		if (value < 0) {
			throw new LessThanZeroException();
		}
		
		String[] dstring = value.toString().split("\\.");
		if (dstring[1].length() > 2) {
			throw new MoneyInputException();
		}
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
