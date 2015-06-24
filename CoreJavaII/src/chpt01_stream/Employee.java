package chpt01_stream;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee implements Serializable{

	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee() {}
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString() {
		return this.getName() 
				+ "[name=" + name + ", salary=" + salary + ", hireDay="
				+ hireDay + "]";
	}
	
	/**
	 * Write employee data to a print writer
	 * @param out
	 */
	public void writeData(PrintWriter out) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(hireDay);
		out.println(name + "|" + salary + "|" + calendar.get(Calendar.YEAR) + "|"
				+ (calendar.get(Calendar.MONTH) + 1) + "|" + calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * Reads employee data from a buffered reader
	 * Use this method to assign values ot Employee object's instance variables. 
	 * @param in
	 */
	public void readData(Scanner in) {
		String line = in.nextLine();
		String[] tokens = line.split("\\|");
		
		this.setName(tokens[0]);
		
		this.setSalary(Double.parseDouble(tokens[1]));
		
		int y = Integer.parseInt(tokens[2]);
		int m = Integer.parseInt(tokens[3]);
		int d = Integer.parseInt(tokens[4]);
		GregorianCalendar calendar = new GregorianCalendar(y, m - 1, d);
		this.setHireDay(calendar.getTime());
	}
}
