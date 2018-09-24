package dataContainers;

public class Customer {
	private Person person;
	private String customerCode;
	private String name;
	private Address address;
	private String type;
	
	public Customer(Person person, String customerCode, String name,
			Address address, String type) {
		super();
		this.person = person;
		this.customerCode = customerCode;
		this.name = name;
		this.address = address;
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	// constructor
	// getter and setter methods
	// other constructors
	
}
