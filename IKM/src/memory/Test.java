package memory;

public class Test {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		String[] strArray = new String[5];
		System.out.println(strArray[0]);
		System.out.println(strArray[1] == null); //true
		
		//System.out.println("sizeOf(new String()) = " + sizeOf(new String()));
	}
	
}
