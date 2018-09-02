/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CheckerboardKarel2 extends SuperKarel {
	public void run() {
		putBeeper();
		fillAllRow();
	}

	private void fillAllRow() {
	
		fillOneRow();
		changeDirection();
		
		while(frontIsClear()) {
			move();
			if(facingNorth()) {
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
			if(noBeepersPresent()){
				move();
				putBeeper();
			} else {
				move();
			}
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

	
	
	

	
