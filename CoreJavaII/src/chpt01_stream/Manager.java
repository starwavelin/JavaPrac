package chpt01_stream;

public class Manager extends Employee {
	
	private Employee secretary;

	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		secretary = null;
	}
	
	public Employee getSecretary() {
		return secretary;
	}

	public void setSecretary(Employee secretary) {
		this.secretary = secretary;
	}
	
	public String toString() {
		return super.toString() + "[secretary=" + secretary + "]";
	}
}
