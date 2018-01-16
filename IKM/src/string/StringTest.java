package string;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		System.out.println(s1 == s2); // FALSE!!! because two different char arrays?
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() == s2.hashCode()); // true
		
		System.out.println(s2 == "Hello"); // true
		System.out.println(s1 == "Hello"); // false
	}
	
}
