package chpt01_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DatFileRW {
	
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[2];
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		try {
			System.out.println("Welcome to the Employee File Read/Write Test!");
			// save all emp records to employee.dat
			PrintWriter out = new PrintWriter("employee.dat");
			writeData(staff, out);
			out.close();
		
			// read all emp records from employee.dat
			Scanner sc = new Scanner(new FileReader("employee.dat"));
			ArrayList<Employee> newStaff = readData(sc);
			sc.close();
			
			// Print out newStaff to Console
			for (int i = 0; i < newStaff.size(); i++) {
				System.out.println(newStaff.get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void writeData(Employee[] emps, PrintWriter out) throws IOException {
		out.println("Number of Employees to write: " + emps.length);
		for (Employee e: emps) {
			e.writeData(out);
		}
	}
	
	private static ArrayList<Employee> readData(Scanner sc) {
		sc.nextLine();	// consume new line
		ArrayList<Employee> ret = new ArrayList<Employee>();
		
		// Read twice
		for (int i = 0; i < 2; i++) {
			Employee e = new Employee();
			e.readData(sc);
			ret.add(e);
		}
		return ret;
	}
}