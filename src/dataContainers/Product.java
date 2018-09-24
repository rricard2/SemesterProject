package dataContainers;

public abstract class Product {
	
	private String productCode;

	public Product(String productCode) {
		super();
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + "]";
	}
	
	public abstract double totalCost();
}
