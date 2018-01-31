package sorting;

public class InsertionSort {

	public static void sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int cur = nums[i], j = i - 1;
			while (j >= 0 && nums[j] > cur) {
				nums[j + 1] = nums[j--];
			}
			if (j + 1 != i) {
				nums[j + 1] = cur;
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
