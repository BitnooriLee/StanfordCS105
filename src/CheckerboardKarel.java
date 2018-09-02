/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
			putBeeperOnTheRow();
			moveToUpperRow();		
		}
		
	}
		
		
	

	private void putBeeperOnTheRow() {
		while(frontIsClear()) {
			moveForward();			
		}		
	}
		
	private void moveForward() {
		if(beepersPresent()) {
			move();
		} else {
				move();
				putBeeper();

			}	
	}
	
	
	
	
	private void moveToUpperRow() {
		if(facingEast()) {
		turnLeft();
		moveForward();
		turnLeft();
		} else {
		turnRight();
		moveForward();
		turnRight();
		
		}
	
	}
	
}

	