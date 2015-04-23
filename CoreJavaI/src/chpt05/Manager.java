package chpt05;

public class Manager extends Employee2 {

	private double bonus; 
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public boolean equals(Object otherObject) {
		// if their super types are already not identical, return false
		if (!super.equals(otherObject)) {
			return false;
		}
		
		// cast otherObject to Manager type
		Manager other = (Manager) otherObject;
		
		// cuz super.equals already checked other fields, here we just need to check the bonus field
		return bonus == other.bonus;
	}
	
	public int hashCode() {
		// for a double field, use primitive number * new Double(theDoubleField).hashCode()
		int hashCode = super.hashCode() + 17 * new Double(bonus).hashCode();
		return hashCode;
	}

	public String toString() {
		String s = super.toString() + "[bonus=" + bonus + "]";
		return s;
	}
}
