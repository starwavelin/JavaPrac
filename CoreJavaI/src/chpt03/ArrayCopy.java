package chpt03;

import java.util.Arrays;

public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] luckyNums = {101, 102, 103, 104, 105, 106, 107};
		System.arraycopy(smallPrimes, 2, luckyNums, 1, 4);
//		for (int i = 0; i < luckyNums.length; i++) {
//			System.out.println(i + ": " + luckyNums[i]);
//		}
//		
//		
		int[][] magicSquare = {
				{16, 3, 2, 13},
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1}
		};
		System.out.println(Arrays.deepToString(magicSquare));
	}

}
