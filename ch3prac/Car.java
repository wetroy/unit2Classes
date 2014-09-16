

/**
 * Write a description of class car here.
 * a car class tracks gas consumpion based on efficiency
 * @author (wetroy) 
 * @version (9/12/14)
 */
public class Car
{
    /** fuel efficiency in mpg */
    private int fuelEfficiency;
    private int fuelTank;
    


    /** 
     * Default constructor for objects of class car
     */
    public Car(int Efficiency)
    {
        this.fuelEfficiency = Efficiency;
        this.fuelTank = 0;
    }

    /**
     * The drive method rduces the fuel in the tank based on the    
     * specified miles and the efficiency of the car
     *
     * @pre        this method is never invoked with a value for miles
     *              that consumes more than the available gas in the tank
     *            (what the method assumes about the method's parameters and class's state)
     *            
     * @param    miles  number of miles driven
     */
    public void drive(int miles)
    {
        // put your code here
    }

    /**
     * Adds the specified amount of gas in gallons to this car's tank
     *
     * @pre     the specified amound of gas doesn's exceed the capacity of this car's tank
     * @param   gallons number of gallones of gas to add to this car's
     *              tank
     */
    public void addGas(int gallons)
    {
        // put your code here
    }

    /**
     * Returns the number of gallons of gas remaining in this car's tank
     *
     * @return  number of gallons of gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
        return 0;
    }
    
}
