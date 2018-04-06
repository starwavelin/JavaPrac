package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SSingleNumber {
	
	/* input = [1, 2, 3, 2] 
	 * 1, 2, 2, 3
	 * */
	
	public int getSingleNum(int[] nums) {
		Arrays.sort(nums); // Time Complexity: O(nlogn)
		for (int i = 1; i < nums.length; i++) { // Space Complexity: O(1)
			if (nums[i] == nums[i-1]) {
				return nums[i];
			}
		}
		return -1;
	}
}
