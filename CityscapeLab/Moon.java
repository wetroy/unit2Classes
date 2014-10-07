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
    /** xLeft     the x point where the left side of the moon starts to be drawn */
    private int xLeft;
    /** the y point where the top of the moon starts to be drawn */    
    private int yTop;
    /**
     * The constructor for objects of class Moon
     * @param x     the x point where the left side of the moon starts to be drawn
     * @param y     the y point where the top of the moon starts to be drawn
     */
    public Moon(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * creates the moon with its color, size, coordinates, and craters
     *
     * @param    g2    a graphics object that is imported 
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
