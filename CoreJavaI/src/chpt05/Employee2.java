package chpt05;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee2 {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee2(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}
	
	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

		public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
		
	public boolean equals(Object otherObject) {
		
		// a quick test to see if the objects are identical
		if (this == otherObject) {
			return true;
		}
		
		// must return false if the explicit parameter is null
		if (otherObject == null) {
			return false;
		}
		
		// if the classes don't match, return false as well
		if (getClass() !=  otherObject.getClass()) {
			return false;
		}
		
		// now we know otherObject is a non-null Employee2 type
		Employee2 other = (Employee2) otherObject;
		
		// test if the fields are idential between this and other
		return (name.equals(other.name) 
				&& salary == other.salary 
				&& hireDay.equals(other.hireDay)
				);
	}	// end of equals(Object otherObject) method
	
	public int hashCode() {
		// hashCode has something to do with name, salary and hireDay
		int hashCode =7 * name.hashCode()
				+ 11 * new Double(salary).hashCode()
				+ 13 * hireDay.hashCode(); 
		return hashCode;
	}
	
	public String toString() {
		String s = getClass().getName() 
				+  "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";				
		return s;
	}
	
}
