import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Billy Troy
 * @version 10/7/14
 */
public class CityscapeComponent extends JComponent
{
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Sky sky1 = new Sky(0,0);
        sky1.draw(g2);        
        Grass grass1 = new Grass(0,385);
        grass1.draw(g2);
        Road road1 = new Road(0,670);
        road1.draw(g2);        
        Moon moon1 = new Moon(12,12);
        moon1.draw(g2);
        Building building9 = new Building(600,225,Color.black);
        building9.draw(g2); 
        Building building8 = new Building(0,225,Color.pink);
        building8.draw(g2);         
        Building building7 = new Building(200,225,Color.green);
        building7.draw(g2);        
        Building building6 = new Building(400,225,Color.yellow);
        building6.draw(g2);
        Building building1 = new Building(100,350,Color.red);
        building1.draw(g2);
        Building building2 = new Building(300,350,Color.magenta);
        building2.draw(g2);
        Building building3 = new Building(500,350,Color.blue);
        building3.draw(g2);
        Building building4 = new Building(700,350,Color.orange);
        building4.draw(g2);
        Building building5 = new Building(-100,350,Color.cyan);
        building5.draw(g2);
        UFO ufo1 = new UFO(435,70);
        ufo1.draw(g2);
    }

}
