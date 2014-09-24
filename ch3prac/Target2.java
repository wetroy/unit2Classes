import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class target2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target2 
{
    /** description of instance variable x (add comment for each instance variable) */
    public void paint(Graphics g)
    {
           Graphics2D g2 = (Graphics2D) g;
           g2.setPaint(Color.red);
           g2.fillArc(50,50,300,300, 0, 360);
           g2.setPaint(Color.blue);
           g2.fillArc(75,75,250,250, 0, 360);    
           g2.setPaint(Color.green);
           g2.fillArc(100,100,200,200, 0, 360);    
           g2.setPaint(Color.magenta);
           g2.fillArc(125,125,150,150, 0, 360);    
           g2.setPaint(Color.yellow);
           g2.fillArc(150,150,100,100, 0, 360); 
           g2.setPaint(Color.pink);
           g2.fillArc(175,175,50,50, 0, 360);               
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
    public static void main(String args[])
    {
      JFrame frame = new JFrame();      
      frame.setTitle("Target");
      frame.setSize(400, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Target2 target = new target2();
      frame.add(target);
      frame.setVisible(true);
    }

}
