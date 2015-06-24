package chpt01_stream;

import java.io.IOException;
import java.io.PrintWriter;

public class DatFileRW {
	
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[2];
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		try {
			System.out.print("Welcome to the Employee File Read/Write Test!");
			// save all emp records to employee.dat
			PrintWriter out = new PrintWriter("employee.dat");
			writeData(staff, out);
			out.close();
			
			
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
	
}
