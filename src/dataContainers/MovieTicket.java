package dataContainers;

public class MovieTicket extends Product {
	private String movieDatetime;
	private String movieName;
	private Address address;
	private double cost;
	public String getMovieDatetime() {
		return movieDatetime;
	}
	public void setMovieDatetime(String movieDatetime) {
		this.movieDatetime = movieDatetime;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public MovieTicket(String productCode, String movieDatetime,
			String movieName, Address address, double cost) {
		super(productCode);
		this.movieDatetime = movieDatetime;
		this.movieName = movieName;
		this.address = address;
		this.cost = cost;
	}
	@Override
	public double totalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
