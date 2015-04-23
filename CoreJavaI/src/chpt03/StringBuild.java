package chpt03;

public class StringBuild {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append('u');
		builder.append("haul");
		String completedString = builder.toString();
		
		System.out.println(completedString);
	}

}
