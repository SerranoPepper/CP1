 


/**
 * It's a gingerbread man, he's in jail
 *
 * @author Elijah
 * @version version 3, 1/18/19
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
	/******** Put your code here  *********/
    
	Color headcolor = new Color(182, 94, 6);

	g2.setColor(headcolor);

	Ellipse2D.Double head = new Ellipse2D.Double(120, 50, 160, 200);
        g2.fill(head);
	
	Ellipse2D.Double body = new Ellipse2D.Double(50, 230, 300, 300);
        g2.fill(body);

	g2.setColor(Color.white);

	Ellipse2D.Double eye1 = new Ellipse2D.Double(150, 125, 30, 30);
        g2.fill(eye1);

	Ellipse2D.Double eye2 = new Ellipse2D.Double(225, 125, 30, 30);
        g2.fill(eye2);

	Color tiecolor = new Color(0, 153, 0);

	g2.setColor(tiecolor);

	Ellipse2D.Double bow = new Ellipse2D.Double(180, 255, 40, 40);
        g2.fill(bow);

	Color button = new Color(204, 102, 0);

	g2.setColor(button);

	Ellipse2D.Double button1 = new Ellipse2D.Double(180, 325, 40, 40);
        g2.fill(button1);

	Color buttonin1 = new Color(153, 76, 0);

	g2.setColor(buttonin1);

	Ellipse2D.Double buttonin = new Ellipse2D.Double(185, 329, 30, 30);
        g2.fill(buttonin);

	g2.setColor(tiecolor);


    int xpoints[] = {200, 250, 250};
    int ypoints[] = {275, 300, 250};
    int npoints = 3;

    g.fillPolygon(xpoints, ypoints, npoints);
        
        
    int x1points[] = {200, 150, 150};
    int y1points[] = {275, 300, 250};
    int n1points = 3;
        
    g.fillPolygon(x1points, y1points, n1points);
        
    Color browcolor = new Color(0, 204, 204);
        
    g2.setColor(browcolor);

    Ellipse2D.Double brow = new Ellipse2D.Double(150, 115, 35, 10);
        g2.fill(brow);
        
    Ellipse2D.Double brow1 = new Ellipse2D.Double(225, 115, 35, 10);
        g2.fill(brow1);
        
    Color mouth = new Color(153, 0, 0);
        
    Shape shape = new Arc2D.Float(160, 175, 80, 80, 0, 180, Arc2D.CHORD);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(mouth);
                g2.setStroke(new BasicStroke(7));
        
                g2.draw(shape);
                g2.setColor(Color.white);
                g2.fill(shape);
        
    g2.setColor(mouth);
        
    Ellipse2D.Double left = new Ellipse2D.Double(100, 260, 20, 150);
        g2.fill(left);
        
    Ellipse2D.Double right = new Ellipse2D.Double(275, 260, 20, 150);
        g2.fill(right);
        
    Color gem = new Color(255, 255, 51);
        
    g2.setColor(gem);
        
    Ellipse2D.Double right1 = new Ellipse2D.Double(275, 315, 25, 20);
        g2.fill(right1);
        
    Ellipse2D.Double left1 = new Ellipse2D.Double(100, 315, 25, 20);
        g2.fill(left1);
        

        drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);

        }
        
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
        }
    }
}
