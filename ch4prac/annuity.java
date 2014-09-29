

/**
 * Write a description of class annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class annuity
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class annuity
     */
    public annuity()
    {
        int PMT = 10000;
        int n = 20;
        double i = .08;
        double PV = Math.round(PMT * ((((1 + (int)i)^((int)n - 1)) - 1) / i) / (((1+(int)i)^((int)n-1)) + 1));
        System.out.println(PV);
    }
}
