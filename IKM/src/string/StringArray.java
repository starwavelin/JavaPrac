package string;

public class StringArray {

	public static void display(String[] strs) {
		for (String s : strs) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String str = "1,#,3,16,";
		String[] arr = str.split(",");
		System.out.println(arr.length);
		display(arr);
	}

}
