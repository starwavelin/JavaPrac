package chpt05;

public class EqualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 alice1 = new Employee2("Alice Adams", 75000, 1987, 12, 15);
		Employee2 alice2 = alice1;	// alice2 == alice1 is true
		Employee2 alice3 = new Employee2("Alice Adams", 75000, 1987, 12, 15);
		Employee2 bob = new Employee2("Bob Brandson", 50000, 1989, 10, 1);
		
		System.out.println("alice1 == alice2: " + (alice1 == alice2)); // true
		
		System.out.println("alice1 == alice3: " + (alice1 == alice3)); // false
		
		System.out.println("alice1.equals(alice3): " + alice1.equals(alice3)); // true
		
		System.out.println("alice1.equals(bob): " + alice1.equals(bob)); // false
		
		System.out.println("bob.toString(): " + bob);
		
		Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		System.out.println("carl.toString(): " + carl);
		System.out.println("boss.toString(): " + boss);
		
		System.out.println("carl.equals(boss): " + carl.equals(boss));  // false
		
		System.out.println("alice1.hashCode(): " + alice1.hashCode());
		System.out.println("alice3.hashCode(): " + alice3.hashCode());
		System.out.println("bob.hashCode(): " + bob.hashCode());
		System.out.println("carl.hashCode(): " + carl.hashCode());
		System.out.println("boss.hashCode(): " + boss.hashCode());
		
	}

}
