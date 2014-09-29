import java.util.Scanner;

/**
 * Write a description of class rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rectangle
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class rectangle
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        int width = sc.nextInt();
        System.out.println("Please enter the length: ");
        int length = sc.nextInt();
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        System.out.println(area);
        System.out.println(perimeter);
    }
}