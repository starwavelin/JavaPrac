package string;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Hello");	// from what ?
		String s2 = "Hello";				// from string pool ?
		
		System.out.println(s1 == s2); // FALSE!!! because two different char arrays?
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() == s2.hashCode()); // true
		
		System.out.println(s2 == "Hello"); // true
		System.out.println(s1 == "Hello"); // false
		
		
		/* String + int, what's gonna happen? */
		String s = "Hey";
		int k = 12;
		String t = s + k;
		String nt = k + s;
		System.out.println("t is: " + t); 	// "Hey12"
		System.out.println("nt is: " + nt);	// "12Hey"
	}
}
