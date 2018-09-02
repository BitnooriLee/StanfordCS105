/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMasonKarel2 extends SuperKarel {
	
	public void run() {	
		replaceMissingStone();		
		while(frontIsClear()) {
			moveToNextPosition();
			turnRight();
			comebackToStartPosition();
			turnLeft();
			replaceMissingStone();
		}
		

}

	private void replaceMissingStone() {
			turnLeft();
		    while(frontIsClear()) {
		    	if(beepersPresent()) {
		    		move();
		    	} else {
		    		putBeeper();
		    		move();
				}
		    }
		    	if(beepersPresent()) {
		    		turnRight();
		    	} else {
		    		putBeeper();
		    		turnRight();
		    	}
		}

	private void moveToNextPosition( ) {
		for(int i=0; i<4; i++) {
			move();	
		}
	}
	
	private void comebackToStartPosition( ) {
		while(frontIsClear()) {
			move();	
		}
	}
}