package chpt05;

import static java.lang.System.out;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[2];
		
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "CS");
		
		for (Person p : people) {
			out.println(p.getName() + ", " + p.getDescription());
		}
		
	}

}
