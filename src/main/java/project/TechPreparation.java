package project;

public final class TechPreparation extends calculate{
	
	private final Double adminSalary;
	private final Double performerSalary;
	private final Double SupStaffSalary;
	private final Double TruckRental;
	private final Double numberOfTrucks;
	private final Double installation;
	private final Double insurance;
	private final Double square;
	private final Double rent;
	
	public TechPreparation(Double adminSalary, Double performerSalary, Double SupStaffSalary, Double TruckRental, Double numberOfTrucks, Double installation, Double insurance, Double square, Double rent) {
		this.adminSalary = adminSalary;
		this.performerSalary = performerSalary;
		this.SupStaffSalary = SupStaffSalary;
		this.TruckRental = TruckRental;
		this.numberOfTrucks = numberOfTrucks;
		this.installation = installation;
		this.insurance = insurance;
		this.square = square;
		this.rent = rent;
}
	
	@Override
	public Double calculation(){
		return adminSalary + performerSalary + SupStaffSalary + (TruckRental * numberOfTrucks) + installation + insurance + (square * rent);
	}

}
