package project;

public final class Close extends calculate{
	
	private final Double close;
	
	public Close(Double close) {
		this.close = close;
}
	
	@Override
	public Double calculation(){
		return close;
	}
}