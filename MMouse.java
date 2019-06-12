import java.awt.geom.Ellipse2D;
import java.awt.*;
import javax.swing.JComponent;

public class MMouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.black);

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);

		Ellipse2D.Double ear1 = new Ellipse2D.Double(60, 45, 100, 100);
		g2.fill(ear1);
		
		Ellipse2D.Double ear2 = new Ellipse2D.Double(240, 45, 100, 100);
		g2.fill(ear2);
		

	}
}
