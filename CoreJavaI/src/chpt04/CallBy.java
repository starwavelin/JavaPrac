package chpt04;

public class CallBy {

	int[] a = {1, 2, 3};
	
//	public CallBy() {
//		a = new int[]{1, 2, 3};
//	}
	
	public void modifyValue(int[] array) {		
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		CallBy testCallBy = new CallBy();
		
		for (int i = 0; i < testCallBy.a.length; i++) {
			System.out.print(testCallBy.a[i] + " ");
		}		// array a should be {1, 2, 3}
		
		System.out.println();
		
		testCallBy.modifyValue(testCallBy.a);  // printed array should be {2, 4, 6}
		
		for (int i = 0; i < testCallBy.a.length; i++) {
			System.out.print(testCallBy.a[i] + " ");
		}		// array a now is {2, 4, 6}
	
	}

}
