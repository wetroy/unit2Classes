

/**
 * Write a description of class Vending_Machine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_Machine
{
    /** number of cans as an integer */
    private int numberCans = 10;
    private int numberTokens;

    /**
     * Default constructor for objects of class Vending_Machine
     */
    public Vending_Machine(int StartingNumberOfCans)
    {
        this.numberCans = StartingNumberOfCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    cans   number of cans that will be added to the vending machine
     */
    public void addCans(int cans)
    {
        this.numberCans = (numberCans + cans);
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void insertToken()
    {
        // Instructions for updating the token and can counts
        this.numberTokens = (numberTokens + 1);
        this.numberCans = (numberCans - 1);
    }

    /**
     * Returns the number of tokens in the machine
     * @return  number of tokens in machine
     */
    public int getTokenCount()
    {
        // put your code here
        return this.numberTokens;
    }

    /**
     * Returns the number of cans in the machine
     * @return  number of cans in maching
     */
    public int getCanCount()
    {
        // put your code here
        return this.numberCans;
    }

}
