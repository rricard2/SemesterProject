package writers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

import dataContainers.Address;
import dataContainers.Customer;
import dataContainers.Person;
import dataContainers.Product;


public class xmlWriter {
	
	private XStream xstream = null;

	public void XMLWriter() {
		this.xstream = new XStream();
		xstream.ignoreUnknownElements();
		//Aliases
		xstream.alias("person", dataContainers.Person.class);
		xstream.alias("email", String.class);
		xstream.alias("unitPrice", Product.class);
		xstream.alias("address", Address.class);
		
	}
	
		public void xmlConverterPerson(ArrayList<Person> person) {
			File xmlOutput = new File("data/Persons.xml");
			PrintWriter xmlPrintWriter = null;
			try {
				xmlPrintWriter = new PrintWriter(xmlOutput);
				} catch (FileNotFoundException e) {
				e.printStackTrace();
				}
		
			// xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
			
		
			//xstream.alias("person", Person.class); 
			for(Person aPerson : person) {
			// converts Person object into a String
				System.out.println(aPerson.toString());
			String personOutput = this.xstream.toXML(aPerson);
			xmlPrintWriter.write(personOutput+"\n");
			}
			
			xmlPrintWriter.close();	
		}
	
		public void xmlConverterCustomer(ArrayList<Customer> customers) {
			File xmlOutput = new File("data/Customers.xml");
			PrintWriter xmlPrintWriter = null;
			try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
			} 
			catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		//xstream.alias("customer", Customer.class); 
			for(Customer aCustomer : customers) {
				String personOutput = xstream.toXML(aCustomer);
				// adds new line for spacing
				xmlPrintWriter.write(personOutput+"\n"); 
			}
			xmlPrintWriter.close();	
		}
	
	public void xmlConvertProduct(ArrayList<Product> product) {
		File xmlOutput = new File("data/Products.xml");
		PrintWriter xmlPrintWriter = null;
		
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// Loop iterating through the products
		for(Product aProduct : product) {
			String productOut = xstream.toXML(aProduct);
			xmlPrintWriter.write(productOut+"\n");
		}
		xmlPrintWriter.close();
	}
	
}

