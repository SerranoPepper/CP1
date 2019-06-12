
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //Creates the frame Template and title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes the frame stop when its closed
		frame.setSize(400, 400); //Sets Frame size
        
        Shapes r = new Shapes(); //A new shape object (From other file)
        frame.add(r); //Add r (shape) to frame

		frame.setVisible(true); //Sets the frame to visible
	}
}

