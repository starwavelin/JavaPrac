package singleElevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RequestHandler {
	
	private Queue<Request> requests;
	private Elevator e;
	
	private static RequestHandler instance = null;
	
	private RequestHandler() {
		e = new Elevator();
		requests = new LinkedList<>();
	}
	
	public static RequestHandler getInstance() {
		if (instance == null) {
			instance = new RequestHandler();
		}
		return instance;
	}
	
	
	public void addRequest(Request req) {
		requests.add(req);
	}
	
	public void processRequest() {
		Request req = getNextRequest();
		while (true) {
			if (req != null) {
				if (e.getStatus() == 0) {
					e.moveToFloor(req.getTargetFloor());
					requests.remove(req);
					break;
				}
			}
		}
	}
	
	private Request getNextRequest() {
		return requests.poll();
	}
	
}
