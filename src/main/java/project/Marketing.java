package project;

public final class Marketing extends calculate {

	private final Double marketing;
	
	public Marketing(Double marketing) {
		this.marketing = marketing;
}
	
	@Override
	public Double calculation(){
		return marketing;
	}
}
