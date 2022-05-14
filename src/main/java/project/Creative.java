package project;

public final class Creative extends calculate{
	
	private final Double creative;
	
	public Creative(Double creative) {
		this.creative = creative;
}
	
	@Override
	public Double calculation(){
		return creative;
	}

}