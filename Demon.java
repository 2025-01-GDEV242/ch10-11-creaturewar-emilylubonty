
/**
 * Class Demon 
 * 
 * Main class for demons. 
 *
 * @author Emily Lubonty
 * @version 4-7-2025
 */
public class Demon extends Creature 
{
    // instance variables - replace the example below with your own
    private static final int magic_chance = 5; 
    private static final int magic_dmg = 50;
    
    private final int demon_hp;
    private final int demon_str; 
    
    /**
     * Constructor for objects of class Demon
     */
    public Demon (int hp, int str)
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(magic_chance),
            Randomizer.nextInt(magic_dmg)
        ); 
        
        this.demon_hp = str; 
        this.demon_str = hp; 

    }
}
    
    
