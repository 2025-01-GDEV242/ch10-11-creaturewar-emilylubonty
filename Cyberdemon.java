
/**
 * Subclass of Demon class, which extends from Creature. 
 *
 * @author Emily Lubonty
 * @version 4-9-2025
 */
public class Cyberdemon extends Demon 
{
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
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR) + MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP) + MIN_CYBERDEMON_HP,
            Randomizer.nextInt(MAX_CYBERDEMON_MAGIC-MIN_CYBERDEMON_MAGIC) + MIN_CYBERDEMON_MAGIC
        );
    }

}
