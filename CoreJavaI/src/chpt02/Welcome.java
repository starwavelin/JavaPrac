package chpt02;

public class Welcome {

	public static void main(String[] args) {
		String[] greetings = new String[3];
		greetings[0] = "Hi ";
		greetings[1] = "Ben, ";
		greetings[2] = "How are you?";
		
		for (String s : greetings) {
			System.out.println(s);
		}
		
	}

}
