import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * A moon that can be put anywhere in the window
 * 
 * @author Billy
 * @version 10/1/14
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;


    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int x, int y)
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
        Ellipse2D.Double moon1 = new Ellipse2D.Double(xLeft, yTop, 50,50);
        g2.setPaint(Color.gray);
        g2.fillArc(xLeft,yTop,150,150,0,360);
        g2.setPaint(Color.darkGray);
        g2.fillArc(xLeft + 90, yTop + 20,20,20, 0, 360);
        g2.fillArc(xLeft + 40, yTop + 30,30,30, 0, 360);
        g2.fillArc(xLeft + 110, yTop + 100,20,20, 0, 360);
        g2.fillArc(xLeft + 70, yTop + 90,25,25, 0, 360);
    }

}
