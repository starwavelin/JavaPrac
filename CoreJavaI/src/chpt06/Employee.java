package chpt06;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>, Cloneable {

	private String name;
	private double salary;
	private Date hireDate;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		hireDate = new Date();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee other) {
		if (salary < other.salary) {
			return -1;
		}
		else if (salary > other.salary) {
			return 1;
		}
		return 0;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public void setHireDate(int year, int month, int day) {
		Date newHireDate = new GregorianCalendar(year, month - 1, day).getTime();
		
		hireDate.setTime(newHireDate.getTime());
	}
	
	public Employee clone() throws CloneNotSupportedException	{
		
		// call Object.clone()
		Employee cloned = (Employee) super.clone();
		
		// clone mutable fields - in this example: hireDate
		cloned.hireDate = (Date) hireDate.clone();
		
		return cloned;
		
		
	}
	
	public String toString() {
		return "Employee[name = " + name + ", salary = " 
				+ salary + ", hireDate = " + hireDate + "]"; 
	}
	 
}
