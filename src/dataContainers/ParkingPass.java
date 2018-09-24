package dataContainers;

public class ParkingPass extends Product {
	
	private double cost;

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}



	public ParkingPass(String productCode, double cost) {
		super(productCode);
		this.cost = cost;
	}
	@Override
	public double totalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
