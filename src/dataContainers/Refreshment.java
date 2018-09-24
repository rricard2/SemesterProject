package dataContainers;

public class Refreshment extends Product{
	
	
	private String name;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public Refreshment(String productCode, String name, double cost) {
		super(productCode);
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public double totalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
