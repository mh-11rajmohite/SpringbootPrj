import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		App a = new App();

		//a.convertJavaToJson();

		 a.convertJsonToJava();

	}

	private void convertJsonToJava() throws Exception{
		// TODO Auto-generated method stub

		File f = new File("customer.json");
		
		ObjectMapper m = new ObjectMapper();
		
		//De-Serialization
		Customer c = m.readValue(f, Customer.class);
		
		
		System.out.println(c.toString());
		
		
		
	}

	private void convertJavaToJson() throws Exception{
		// TODO Auto-generated method stub

		Customer c = new Customer();

		c.setId(101);
		c.setName("Raj");
		c.setPhono(89643);
		c.setGender("Male");

		File f = new File("customer.json");
		
		ObjectMapper m = new ObjectMapper();
		
		//Serialization
		m.writeValue(f, c);
		
		System.out.println("Serialization completed ..............");
		
	}

}
