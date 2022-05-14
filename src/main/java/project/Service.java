package project;

public final class Service extends calculate{
	
	private final Double service;
	private final Double energy;
	private final Double water;
	private final Double security;
	private final Double days;
	
	public Service(Double service, Double energy, Double water, Double security, Double days) {
		this.service = service;
		this.energy = energy;
		this.water = water;
		this.security = security;
		this.days = days;
}
	
	@Override
	public Double calculation(){
		return (service + ((energy + water + security) * days));
	}
}
