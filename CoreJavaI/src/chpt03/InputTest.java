package chpt03;

import java.util.Scanner;

public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Your name is: ");
		String name = in.nextLine();
		
		System.out.println("Your age is: ");
		int age = in.nextInt();
		
		System.out.println("Hello, " + name +
				". Next Year you will be " + (age + 1));
	}

}
