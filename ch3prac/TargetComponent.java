
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * draws two targets
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(25,25, Color.BLUE);
        
        int x = getWidth() - 3;
        int y = getHeight() - 3;
        
        Target target2 = new Target(425,425, Color.WHITE);
        Target target3 = new Target(25,425, Color.WHITE);        
        Target target4 = new Target(425,25, Color.WHITE);        
        target1.draw(g2);
        target2.draw(g2);
        target3.draw(g2);
        target4.draw(g2);        
    }
}

