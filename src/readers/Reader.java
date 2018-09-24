package readers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dataContainers.Address;
import dataContainers.Customer;
import dataContainers.MovieTicket;
import dataContainers.ParkingPass;
import dataContainers.Person;
import dataContainers.Product;
import dataContainers.Refreshment;
import dataContainers.SeasonPass;

public class FlatDatReader {
	
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	//create a local array list outside methods
	public ArrayList<Person> readPersons() {
		
		
		try {
			File f = new File("data/Persons.dat"); //scan in the file
			Scanner s = new Scanner(f);
			String line = s.nextLine();
			int iterate = Integer.parseInt(line); // find out of large the .dat file is
			int k =0;
			for (k=0; k<iterate; k++) {
				line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Person e = null; // initiate a null empty Object
					String tokens[] = line.split(";"); //split the read and set a lot of variables
					
					String personCode = tokens[0];
					
					String nameTokens[] = tokens[1].split(",");
					String lastName = nameTokens[0];
					String firstName = nameTokens[1];
					
					String addressParts[] = tokens[2].split(",");
					String addressStreet = addressParts[0];
					String addressCity = addressParts[1];
					String addressState = addressParts[2];
					String addressZip = addressParts[3];
					String addressCountry = addressParts[4];
					Address address = new Address(addressStreet, addressCity, addressState, addressZip, addressCountry);
					
					// create the new object with all the variables
					e = new Person(firstName, lastName, personCode, address);
				 // add extra elements to the object
					ArrayList<String> emails = new ArrayList<String>();
					if(tokens.length > 3) {
						int i = tokens.length;
						String emailsList[] = tokens[3].split(",");
						for (i = 0; i<emailsList.length; i++){
							emails.add(emailsList[i]);
						}
						e.setEmail(emails);
					}
					
					//add to the non-method specific array
					persons.add(e);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return persons; //return an ArrayList
	}
	
	//please refer to the comments on the above method
	public ArrayList<Customer> readCustomers() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			File f = new File("data/Customers.dat");
			Scanner s = new Scanner(f);
			String line = s.nextLine();
			int iterate = Integer.parseInt(line);
			int k =0;
			for (k=0; k<iterate; k++) {
				 line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Customer e = null;
					String tokens[] = line.split(";");
					
					String customerCode = tokens[0];
					
					String letter = tokens[1];					
					
					String name = tokens[3];
					
					String addressParts[] = tokens[2].split(",");
					String addressStreet = addressParts[0];
					String addressCity = addressParts[1];
					String addressState = addressParts[2];
					String addressZip = addressParts[3];
					String addressCountry = addressParts[4];
					Address address = new Address(addressStreet, addressCity, addressState, addressZip, addressCountry);
					
					String personCode = tokens[2];
					int i =0;
					Person p ;
					for (i =0; i< persons.size(); i++){
						p = persons.get(i);
						if (p.getPersonCode() == personCode) {
							e = new Customer(p, customerCode, name, address, letter);
							break;
						}
					}
					
					
				// e = new Customer(p, customerCode, name, address, letter);
				
					customers.add(e);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return customers;
	}
		
	//please refer to the comments on the above method
	public ArrayList<Product> readProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			File f = new File("data/Products.dat");
			Scanner s = new Scanner(f);
			String line = s.nextLine();
			int iterate = Integer.parseInt(line);
			int k =0;
			for (k=0; k<iterate; k++) {
				 line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Product e = null;
					String tokens[] = line.split(";");
					String productCode = tokens[0];
					
					String letter = tokens[1];					
					if (letter == "P") {
						double cost = Double.parseDouble(tokens[2]);
						e = new ParkingPass(productCode, cost);
						
					} else if (letter == "R") {
						String name = tokens[2];
						
						double cost = Double.parseDouble(tokens[3]);
						
						e = new Refreshment(productCode, name, cost);
					} else if (letter == "S") {
						String name = tokens[2];
						String startDate = tokens[3];
						String endDate = tokens[4];
						double cost = Double.parseDouble(tokens[5]);
						
						e = new SeasonPass(productCode, name, startDate, endDate, cost);
					} else if (letter == "M") {
						
						String dateTime = tokens[2];
						
						String name = tokens[3];
						
						String addressParts[] = tokens[4].split(",");
						String addressStreet = addressParts[0];
						String addressCity = addressParts[1];
						String addressState = addressParts[2];
						String addressZip = addressParts[3];
						String addressCountry = addressParts[4];
						Address address = new Address(addressStreet, addressCity, addressState, addressZip, addressCountry);
						
						double cost = Double.parseDouble(tokens[5]);
						
						e = new MovieTicket(productCode, dateTime, name, address, cost);
					}
									
					products.add(e);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}	
	
	
	
	
	
}

