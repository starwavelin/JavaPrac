package singleElevator;

/**
 * Reference: https://www.jiuzhang.com/qa/129/
 */
public class Elevator {
	
	private int currentFloor;
	private int status;  // 0 - idle; 1 -- moving up; -1 moving down.
	
	public Elevator() {
		this(0);
	}
	
	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
		this.status = 0;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void moveToFloor(int targetFloor) {
		while (currentFloor < targetFloor) {
			moveUp();
		}
		while (currentFloor > targetFloor) {
			moveDown();
		}
		status = 0; // set status to idle
 	}
	
	private void moveUp() {
		status = 1; 
		currentFloor++;
	}
	
	private void moveDown() {
		status = -1;
		currentFloor--;
	}
}
