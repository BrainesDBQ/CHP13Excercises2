package chapter13Recursion;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class Triangles {

class myJPanel extends JPanel {
	int level = 8;
		
		// defined here so I could override the paint method
		
		public void paint(Graphics g)
	    {
	        Point pointOne = new Point(g.getClipBounds().width/2,10);//Point(60, 160);
	        Point pointTwo = new Point(g.getClipBounds().width-10,g.getClipBounds().height-10);//Point(220, 160);
	        Point pointThree = new Point(10, g.getClipBounds().height-10); //Point(140, 20);

	        // call the recursive drawing function
	        drawSierpinski(g, level, pointOne, pointTwo,
	                       pointThree);
	    }

	    private void drawSierpinski(Graphics g, int lev,
	                                Point p1, Point p2, Point p3)
	    {
	       // Draw a triangle using these three points
	    	Point midP1P2;
	        Point midP2P3;
	        Point midP3P1;

	        // base case is implicit (level > 0) - do something
	        //    if level <= 0 do nothing!
	        // where is the base case?
	        if (lev > 0)
	        {
	        	// first draw the triangle given to me
	            g.drawLine(p1.x, p1.y, p2.x, p2.y);
	            g.drawLine(p2.x, p2.y, p3.x, p3.y);
	            g.drawLine(p3.x, p3.y, p1.x, p1.y);

	            // calculate new points for smaller triangle
	            midP1P2 = midPoint(p1, p2);
	            midP2P3 = midPoint(p2, p3);
	            midP3P1 = midPoint(p3, p1);

	            // recurse to one level less - three times!
	            drawSierpinski(g, lev - 1, p1, midP1P2, midP3P1);
	            drawSierpinski(g, lev - 1, p2, midP2P3, midP1P2);
	            drawSierpinski(g, lev - 1, p3, midP3P1, midP2P3);
	        }
	    }

	    private Point midPoint(Point pOne, Point pTwo)
	    {
	        Point mid = new Point((pOne.x + pTwo.x) / 2,
	                              (pOne.y + pTwo.y) / 2);

	        return mid;
	    }
		
		
	}
}


