package sorting;

public class SelectionSort {
	public static void sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(nums, i, minIndex);
			}
		}
	}
	private static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
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
