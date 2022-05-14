package project;

public final class Event extends calculate{
	
	private final Double event;
	
	public Event(Double event) {
		this.event = event;
}
	
	@Override
	public Double calculation(){
		return event;
	}
}