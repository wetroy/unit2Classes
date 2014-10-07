import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * A road with dashed yellow lines that can be places anywhere in the window
 * 
 * @author Billy Troy
 * @version 10/7/14
 */
public class Road
{
    /** xLeft     the x point where the left side of the road starts to be drawn */
    private int xLeft;
    /** the y point where the top of the road starts to be drawn */    
    private int yTop;
    /**
     * The constructor for objects of class Road
     * @param x     the x point where the left side of the road starts to be drawn
     * @param y     the y point where the top of the road starts to be drawn
     */
    public Road(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * creates the road with its color, size, coordinates, and dashed lines
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double road1 = new Rectangle2D.Double(xLeft,yTop,500,500);
        g2.setPaint(Color.black);
        g2.fillRect(xLeft,yTop, 800,700);
        g2.setPaint(Color.yellow);
        for (int i = 1; i<10;i++){
            g2.fillRect(xLeft + 20, yTop + 60, 70, 20);
            xLeft = xLeft  + 90;
        }
    }

}
