package project;

public final class OverheadCosts extends calculate{
	
	
	private final Double sum;
	private final Double percent;
	
	public OverheadCosts(Double sum, Double percent) {
		this.sum = sum;
		this.percent = percent;
}
	
	@Override
	public Double calculation(){
		return sum * (percent / 100);
	}
}
