import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
   	 Robot robo = new Robot();
   	robo.setPenWidth(10);
   	robo.penDown();
String haha = JOptionPane.showInputDialog("What color would you like the robot to draw? Blue or purple? ");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
 if (haha.equals("blue")) {
	 
robo.setPenColor(000,000,119);

}

if (haha.equals("purple")) {
robo.setPenColor(102,000,255);	
}

	

	

   


   	 // 1. make the Robot draw a shape
robo.moveTo(100, 100);

    }

}