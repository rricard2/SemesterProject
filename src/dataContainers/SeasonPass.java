package dataContainers;

public class SeasonPass extends Product{
	private String name;
	private String seasonStartDate;
	private String seasonEndDate;
	private double cost;
	
	public SeasonPass(String productCode, String name, String seasonStartDate,
			String seasonEndDate, double cost) {
		super(productCode);
		this.name = name;
		this.seasonStartDate = seasonStartDate;
		this.seasonEndDate = seasonEndDate;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeasonStartDate() {
		return seasonStartDate;
	}
	public void setSeasonStartDate(String seasonStartDate) {
		this.seasonStartDate = seasonStartDate;
	}
	public String getSeasonEndDate() {
		return seasonEndDate;
	}
	public void setSeasonEndDate(String seasonEndDate) {
		this.seasonEndDate = seasonEndDate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public double totalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
