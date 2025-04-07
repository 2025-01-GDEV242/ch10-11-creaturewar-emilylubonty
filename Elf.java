
/**
 * A magical creature. 
 *
 * @author Emily Lubonty
 * @version 4-7-2025
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8; 
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5; 

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR) + MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP) + MIN_ELF_HP
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
        
    // }
}
