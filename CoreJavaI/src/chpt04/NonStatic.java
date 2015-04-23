package chpt04;

public class NonStatic {

	int i; 
	static int j;
	
	
	static int foo() {
		// i = i + 1;
		j = j + 1;
		return j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
