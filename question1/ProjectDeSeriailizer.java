package javaAssignment.question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class ProjectDeSeriailizer {

	Map<Project, ArrayList<Employee>> employee;

	@SuppressWarnings("unchecked")
	synchronized public Map<Project, ArrayList<Employee>> projectDeSeriailizer() {
		try {
			FileInputStream fileInput = new FileInputStream(
					"C:\\Users\\hp\\eclipse-workspace\\javaAssignment\\src\\javaAssignment\\file.txt");
			ObjectInputStream in = new ObjectInputStream(fileInput);
			employee = (Map<Project, ArrayList<Employee>>) in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return employee;

	}

}
