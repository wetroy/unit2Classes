import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * A target shape that can be put anywhere in the window
 */
public class Target
{
    private int xLeft;
    private int yTop;
    private Color color;
    public Target(int x, int y, Color c)
    {
        xLeft = x;
        yTop = y;
        color = c;
    }
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double target1 = new Ellipse2D.Double(xLeft + 0, yTop + 0,50,50);
        g2.setPaint(Color.red);
        g2.fillArc(xLeft,yTop,300,300, 0, 360);
        g2.setPaint(Color.blue);
        g2.fillArc(xLeft + 25,yTop + 25,250,250, 0, 360);    
        g2.setPaint(Color.green);
        g2.fillArc(xLeft + 50,yTop + 50,200,200, 0, 360);    
        g2.setPaint(Color.magenta);
        g2.fillArc(xLeft+ 75,yTop + 75,150,150, 0, 360);            
        g2.setPaint(Color.yellow);
        g2.fillArc(xLeft+ 100,yTop + 100,100,100, 0, 360); 
        g2.setPaint(Color.pink);
        g2.fillArc(xLeft + 125,yTop + 125,50,50, 0, 360);       
    }
}
