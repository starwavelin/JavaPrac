package demo;

public class LongestUniformSubstring2 {

	public static class Solution {
		public int[] longestUniformSubstring(String s) {
			if (s == null || s.length() == 0) {
				return new int[] {-1, 0};
			}
			int maxLen = 1, curLen = 1;
			int maxStartingIndex = 0, curStartingIndex = 0;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i - 1) == s.charAt(i)) {
					curLen++;
				} else {
					curLen = 1;
					curStartingIndex = i;
				}
				
				if (curLen > maxLen) {
					maxLen = curLen;
					maxStartingIndex = curStartingIndex;
				}
			}
			
			return new int[] {maxStartingIndex, maxLen};
		}
	}
	
	
	public static void main(String[] args) {
		Solution sl = new Solution();
		
		System.out.println("an empty string, starting index: " + sl.longestUniformSubstring("")[0]
				+ " longest length: " + sl.longestUniformSubstring("")[1]); 
				// Output: -1, 0
		
		System.out.println("X, starting index: " + sl.longestUniformSubstring("X")[0]
				+ " longest length: " + sl.longestUniformSubstring("X")[1]); 
				// Output:  0, 1
		
		System.out.println("aaoooookkg, starting index: " + sl.longestUniformSubstring("aaoooookkg")[0]
				+ " longest length: " + sl.longestUniformSubstring("aaoooookkg")[1]); 
				// Output:  2, 5
		
		System.out.println("c9999999bdllllllllF, starting index: " 
				+ sl.longestUniformSubstring("c9999999bdllllllllF")[0]
				+ " longest length: " + sl.longestUniformSubstring("c9999999bdllllllllF")[1]);
				// output: 10, 8. 
				// There are seven 9's and eight l's. output is contributed by eight l's
	}
}
