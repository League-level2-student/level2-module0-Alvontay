package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		Robot[] robotArray = new Robot[5];
		Random r = new Random();
		boolean win = false;
		
		Robot.setWindowColor(30,40,50);
		
		for (int i = 0; i < robotArray.length; i++) {
			
			robotArray[i] = new Robot();
			robotArray[i].setY(600);
			robotArray[i].setX(i * 180 + 85);
			robotArray[i].hide();
			robotArray[i].penDown();
			robotArray[i].setSpeed(25);
			
		}
		
		while (!win) {
			for (int i = 0; i < robotArray.length; i++) {
				robotArray[i].setPenWidth(r.nextInt(10) + 1);
				robotArray[i].setRandomPenColor();
				robotArray[i].move(r.nextInt(20));
				robotArray[i].sparkle();
				if (robotArray[i].getY() < 0) {
					win = true;
					robotArray[i].show();
				}
			}
		}
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
