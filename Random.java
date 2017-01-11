package sandy;

import Media.Turtle;
import Media.TurtleDisplayer;

public class Random {
	
	
	private TurtleDisplayer display;
	private Turtle yertle;
	
	
	public Random( ){
		yertle = new Turtle();
		display = new TurtleDisplayer();
		display.placeTurtle(yertle);
		yertle.setSpeed(12);
		for(int i =0; i<24; i++){
			Dodecagon();
			yertle.right(Math.PI/12);
		}
			
		
	}
	
	private void Dodecagon(){
		yertle.penDown();
		double turn = 2*Math.PI /12;
		
		for(int i = 0; i<12; i++){
			yertle.right(turn);
			yertle.forward(25);
		}
	}
	public static void main(String args[]){Random r = new Random();}
}
