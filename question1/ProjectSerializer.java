package javaAssignment.question1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectSerializer {
	ArrayList<Employee> elist1 = new ArrayList<>();
	ArrayList<Employee> elist2 = new ArrayList<>();
	ArrayList<Employee> elist3 = new ArrayList<>();

	Map<Project, ArrayList<Employee>> projectMap1 = new HashMap<>();
	Map<Project, ArrayList<Employee>> projectMap2 = new HashMap<>();
	Map<Project, ArrayList<Employee>> projectMap3 = new HashMap<>();

	synchronized public void serializeProjectDetails(Map<Project, ArrayList<Employee>> projectMap1) throws IOException {
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"C:\\Users\\hp\\eclipse-workspace\\javaAssignment\\src\\javaAssignment\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(projectMap1);
			out.close();
			fileOut.close();
			System.out.println("Serialized Map of Project Successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
