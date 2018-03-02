package singleElevator;

public class User {
	
	public void makeRequest(int targetFloor) {
		RequestHandler.getInstance().addRequest(new Request(targetFloor));
	}
	
}
