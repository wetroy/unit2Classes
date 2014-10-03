import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private Color color;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y, Color c)
    {
        xLeft = x;
        yTop = y;
        color = c;
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
        Rectangle2D.Double building1 = new Rectangle2D.Double(xLeft,yTop,50,50);
        g2.setPaint(color);
        g2.fillRect(xLeft,yTop, 150,300);
        g2.setPaint(Color.lightGray);
        for (int i = 1; i<7;i++){
            xLeft = xLeft + 20;
            g2.fillRect(xLeft, yTop + 20, 10,10);
                for (int j = 1; j<15;j++){
                    yTop = yTop + 20;
                    g2.fillRect(xLeft, yTop, 10,10);
                }
            yTop = yTop - 280;
            }

    }

}
