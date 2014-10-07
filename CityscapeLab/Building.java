import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A building with a customizable color that can be put anywhere in the window
 * 
 * @author Bill Troy 
 * @version 10/7/14
 */
public class Building
{
    /** xLeft     the x point where the left side of the building starts to be drawn */
    private int xLeft;
    /** the y point where the top of the building starts to be drawn */    
    private int yTop;
    /** the color the building will be */
    private Color color;
    /**
     * The constructor for objects of class Building
     * @param x     the x point where the left side of the building starts to be drawn
     * @param y     the y point where the top of the building starts to be drawn
     * @param c     the color the building will be
     */
    public Building(int x, int y, Color c)
    {
        xLeft = x;
        yTop = y;
        color = c;
    }

    /**
     * creates the building with its color, size, coordinates, and windows
     *
     * @param    g2    a graphics object that is imported 
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
