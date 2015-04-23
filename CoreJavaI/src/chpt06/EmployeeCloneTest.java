package chpt06;

public class EmployeeCloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee original = new Employee("John Joe", 50000);
			original.setHireDate(2000, 1, 1);
			
			// cloned from original
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDate(2002, 1, 1);
			
			System.out.println("original = " + original);
			System.out.println("copy = " + copy);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
