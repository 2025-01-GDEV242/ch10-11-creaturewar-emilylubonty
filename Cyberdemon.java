
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cyberdemon extends Demon 
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25; 
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    
    private static final int MAX_CYBERDEMON_MAGIC = 100;
    private static final int MIN_CYBERDEMON_MAGIC = 1;
    
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR) + MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP) + MIN_CYBERDEMON_HP,
            Randomizer.nextInt(MAX_CYBERDEMON_MAGIC-MIN_CYBERDEMON_MAGIC) + MIN_CYBERDEMON_MAGIC
        );
    }

    // /**
     // * An example of a method - replace this comment with your own
     // *
     // * @param  y  a sample parameter for a method
     // * @return    the sum of x and y
     // */
    // public int sampleMethod(int y)
    // {
        // // put your code here
        // return x + y;
    // }
}
