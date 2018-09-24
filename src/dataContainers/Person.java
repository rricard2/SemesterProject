package dataContainers;

import java.util.ArrayList;

public class Person {
	private String firstName;
	private String lastName;
	private String personCode;
	private Address address;
	private ArrayList <String> email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<String> getEmail() {
		return email;
	}
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	
	public Person(String firstName, String lastName, String personCode,
			Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personCode = personCode;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", personCode=" + personCode + ", address=" + address
				+ ", email=" + email + "]";
	}
	
}
