package converter;

import java.io.Reader;
import java.util.ArrayList;

import dataContainers.Customer;
import dataContainers.Person;
import dataContainers.Product;
import dataContainers.Address;
import writers.xmlWriter;
import readers.FlatDatReader;

public class DataConverter {

	public static void main(String[] args) {
		
		// Creating reader object
		FlatDatReader read = new FlatDatReader();
		
		// Storing ArrayLists created Reader
		ArrayList<Person> people = read.readPersons();
		ArrayList<Customer> cust = read.readCustomers();
		ArrayList<Product> prods = read.readProducts();
		
		
		// Writing to .xml
		xmlWriter xml = new xmlWriter();
		
		xml.xmlConverterPerson(people);
		xml.xmlConverterCustomer(cust);
		xml.xmlConvertProduct(prods);
	}

}
