/* Stanford CS106A 
 * Assignment #1 Karel the Robot
 * Problem2  repair a set of arches where some of the stones are missing
 * Bitnoori Lee 2018 09 01 
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {	
		fillAllColumn();
	}


	private void fillAllColumn() {
		while(frontIsClear()) {
			filltheColumn();
			comebackToStartPosition();
			moveToNextColumn();
		}
		filltheColumn();
		comebackToStartPosition();
	}
	private void filltheColumn() {
		turnLeft();
		while(frontIsClear()) {
			fillTheHole();
			move();
		}
		fillTheHole();
		turnRight();
	}
	
	private void fillTheHole() {
		if(noBeepersPresent()) {
			putBeeper();
		}
	}
	
	private void moveToNextColumn(){
		for(int i=0; i<4; i++) {
			move();
		}
	}
	private void comebackToStartPosition() {
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		}
}

   