package arrays;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {	
	//2. create an army of 5 robots.
Robot[] army = new Robot[5];
Random rand = new Random();
	//3. use a for loop to initialize the robots.
for (int i = 0;i<army.length;i++) {
army[i] = new Robot();
army[i].setX(i*100+50);
army[i].setY(530);
}
	//4. make each robot start at the bottom of the screen, side by side, facing up
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int a = 0; a < army.length; a++) {	
	while (army[a].getY()>0) {			
for (int j = 0; j < army.length; j++) {
	army[j].setSpeed(Integer.MAX_VALUE);
	army[j].move(rand.nextInt(5));
	if(army[j].getY()<=0) {
		System.out.println("Robot "+j+" wins! There's a party!");
		System.exit(0);
}
}
}	
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//7. declare that robot the winner and throw it a party!
	//8. try different races with different amounts of robots.
	//9. make the robots race around a circular track.
}

}
