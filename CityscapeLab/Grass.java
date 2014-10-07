import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Grass for the backround of the window that can be places anywhere
 * 
 * @author Billy Troy
 * @version 10/7/14
 */
public class Grass
{
    /** xLeft     the x point where the left side of the grass starts to be drawn */
    private int xLeft;
    /** the y point where the top of the grass starts to be drawn */    
    private int yTop;
    /**
     * The constructor for objects of class Grass
     * @param x     the x point where the left side of the grass starts to be drawn
     * @param y     the y point where the top of the grass starts to be drawn
     */
    public Grass(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * creates the grass with its color, size, and coordinates
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double grass1 = new Rectangle2D.Double(xLeft,yTop,500,500);
        g2.setPaint(Color.green);
        g2.fillRect(xLeft,yTop, 800,800);
    }

}
