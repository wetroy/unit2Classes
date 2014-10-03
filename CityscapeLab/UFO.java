import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Polygon;


/**
 * Write a description of class UFO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UFO
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;


    /**
     * Default constructor for objects of class UFO
     */
    public UFO(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon1 = new Ellipse2D.Double(xLeft, yTop, 80,30);
        Polygon2D.Double ray1 = new Polygon2D
        g2.setPaint(Color.lightGray);
        g2.fillArc(xLeft,yTop,80,30,0,360);        
        g2.fillArc(xLeft + 30,yTop - 10,20,20,0,360);

    }

}
