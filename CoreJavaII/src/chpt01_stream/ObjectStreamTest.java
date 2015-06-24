package chpt01_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		carl.setSecretary(harry);
		Manager tony = new Manager("Tony Tester", 40000, 1990, 3, 15);
		tony.setSecretary(harry);
		
		Employee[] staff = new Employee[3];
		staff[0] = harry;
		staff[1] = carl;
		staff[2] = tony;
		
		try {
			// Save all employee records to file employee2.dat
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee2.dat"));
			out.writeObject(staff);
			out.close();
			
			// Retrieve all records into a new array
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee2.dat"));
			Employee[] newStaff = (Employee[]) in.readObject();
			in.close();
			
			// print the newly read employee records from employee2.dat
			for (Employee e: newStaff) {
				System.out.println(e);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
