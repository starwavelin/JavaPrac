package demo;

public class LongestUniformSubstring1 {
	
	public static class Solution {
		public int getLongestLength(String s) {
			if (s == null || s.length() == 0) {
				return 0;
			}
			int maxLen = 1, curLen = 1;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i - 1) == s.charAt(i)) {
					curLen++;
				} else {
					curLen = 1;
				}
				if (curLen > maxLen) {
					maxLen = curLen;
				}
			}
			
			return maxLen;
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("Length of longest substring for an empty string is: " + s.getLongestLength("")); // Output: 0
		System.out.println("Length of longest substring for X is: " + s.getLongestLength("X")); // Output: 1
		System.out.println("Length of longest substring for aaoooookkg is: " + s.getLongestLength("aaoooookkg")); // Output: 5
		System.out.println("Length of longest substring for c9999999bdllllllllF is: " + s.getLongestLength("c9999999bdllllllllF")); 
			// output: 8. 
			// There are seven 9's and eight l's. output is contributed by eight l's
	}
}
