import java.awt.geom.Ellipse2D;
import java.awt.*;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		Rectangle box = new Rectangle(5, 10, 50, 30); //Creates a rectangle object with x5 y10 width 20 height30
		g2.draw(box); //draws the rectangle

		g2.setColor(Color.blue); //Sets pen blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);

	}
}
