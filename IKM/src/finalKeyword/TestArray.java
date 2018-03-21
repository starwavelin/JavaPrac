package finalKeyword;

public class TestArray {
	
	private static final int[] arr = new int[] {1, 2, 3};
	
	public static void main(String[] args) {
		arr[0] = 4;
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		int[] arr2 = new int[] {89, 89, 90};
		// arr = arr2; // not allowed unless remove final keyword for arr.
	}
	
}
