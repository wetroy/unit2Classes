

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class Vending_MachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_MachineTest
{


    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {

    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddCans()
    {
        Vending_Machine testmachine = new Vending_Machine(10);
        testmachine.addCans(20);
        int cans = testmachine.getCanCount();
        assertEquals(30, cans);
    }

    @Test
    public void testInsetToken()
    {
        Vending_Machine testmachine = new Vending_Machine(10);
        testmachine.insertToken();
        int cans = testmachine.getCanCount();
        int tokens = testmachine.getTokenCount();
        assertEquals(9, cans);
        assertEquals(1, tokens);
    }

}
