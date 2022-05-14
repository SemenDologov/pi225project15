package project;

public final class Gifts extends calculate {

	private final Double gifts;
	
	public Gifts(Double gifts) {
		this.gifts = gifts;
}
	
	@Override
	public Double calculation(){
		return gifts;
	}
}
