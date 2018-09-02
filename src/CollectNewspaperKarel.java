/* Stanford CS106A 
 * Assignment #1 Karel the Robot
 * Problem1 get Karel to collect the newspaper 
 * Bitnoori Lee 2018 09 01 
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	public void run() {
		moveTotheNewspaper();
		pickBeeper();
		returnToStart();
	}
/*
 * move to the door from the starting position 	
 */
	private void moveTotheNewspaper() {
		for(int i=0 ; i<2 ; i++ ) {
			move();
		}
			turnRight();
			move();
			turnLeft();
			move();
		}
	
/*
 *  comeback the starting position 	
 */
	private void returnToStart(){
		turnAround();
		moveTotheNewspaper();
		turnAround();
	}
			
	
}

