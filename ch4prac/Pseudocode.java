import java.util.Scanner;

/**
 * Write a description of class Pseudocode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pseudocode
{
    /** enters a number and converts it to miles, feet, and inches */
    private int x;

    /**
     * Default constructor for objects of class Pseudocode
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value in yards");
        double yards = sc.nextDouble();
        final double FEET_PER_YARD = 3;
        final double INCHES_PER_FEET = 12;
        final double MILES_PER_YARD = 0.000568182;
        double feet = yards * FEET_PER_YARD;
        double inches = feet * INCHES_PER_FEET;
        double miles = yards * MILES_PER_YARD;
        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
        System.out.println(yards + " yards are " + miles + " miles");
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
    public double sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
