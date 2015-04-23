package chpt03;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the highest number you can draw: ");
		int n = in.nextInt(); // n = 490
		
		System.out.print("How many numbers you need to draw: ");
		int k = in.nextInt(); // k = 60
		
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).
					divide(BigInteger.valueOf(i));
		}
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
		
	}

}
