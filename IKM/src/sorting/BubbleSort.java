package sorting;

public class BubbleSort {
	
	public static void sort(int[] nums) {
		for (int i = nums.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (nums[j-1] > nums[j]) {
					int t = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = t;
				}
			}
		}
	}
	
	public static void display(int[] nums) {
		for (int element : nums) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {2, 9, 5, 3, 1};
		sort(nums);
		display(nums);
		nums = new int[] {Integer.MAX_VALUE, 2578987, Integer.MIN_VALUE, -908, 13, 2, Integer.MIN_VALUE};
		sort(nums);
		display(nums);
	}
}
