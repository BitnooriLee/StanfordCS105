/* Stanford CS106A 
 * Assignment #1 Karel the Robot
 * Problem3  get Karel to create a checkerboard pattern of beepers
 * develope it using stepwise refinement technique
 * Bitnoori Lee 2018 09 01 
 */

import stanford.karel.*;


public class CheckerboardKarel3 extends SuperKarel {
	public void run() {
		putBeeper();
		fillAllRow();
	}

	private void fillAllRow() {
	
		fillOneRow();
		changeDirection();
		
		while(frontIsClear()) {
			fillNext();
			if(rightIsBlocked()) {
				turnLeft();
				} else {
					turnRight();
					}
			
			fillOneRow();
			changeDirection();
			
		}
	}
			
		 
			
	private void fillOneRow() {
		while(frontIsClear()) {
			fillNext();
		}
		
	}
	
	private void fillNext() {
		if(noBeepersPresent()){
			move();
			putBeeper();
		} else {
			move();
		}
	}
	
	private void changeDirection() {
		if(facingEast()) {
			turnLeft();
			} else {
				turnRight();
			}
			
		}
	
	}

	
	
	

	
