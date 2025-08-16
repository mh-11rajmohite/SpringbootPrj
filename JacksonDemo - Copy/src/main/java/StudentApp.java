import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentApp {

	public static void jsonToObject() throws StreamReadException, DatabindException, IOException {
		File f = new File("Student.json");

		ObjectMapper m = new ObjectMapper();

		Student s = (Student)m.readValue(f, Student.class);
		
		System.out.println(s.toString());
		
	}

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		Student s = new Student();
		s.setId(101);
		s.setName("Raj");
		s.setAddress("Pune");
		s.setAge(20);

		File f = new File("Student.json");

		ObjectMapper m = new ObjectMapper();

		m.writeValue(f, s);

		jsonToObject();
	}
}
