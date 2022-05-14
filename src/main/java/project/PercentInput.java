package project;

public final class PercentInput extends lineInput {
	
	private String label;
	
	public PercentInput(String label) {
		super(label);
		setLabel(label);
	}

	@Override
	public void checkinput() throws LessThanZeroException, PercentException, WholeNumberException {
		
		Double value = Double.parseDouble(getLabel());
		
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
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}