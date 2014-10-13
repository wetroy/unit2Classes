import java.util.Scanner;

/**
 * Write a description of class StringParsing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringParsing
{
    /** description of instance variable x (add comment for each instance variable) */

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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 10,000 and 999,999 with a comma: ");
        String comma = sc.nextLine();
        int lengt = comma.length();
        String first = comma.substring(0, lengt-4);
        String last = comma.substring(lengt-3);
        String num = first + last;
        System.out.print(num);
    }

}
