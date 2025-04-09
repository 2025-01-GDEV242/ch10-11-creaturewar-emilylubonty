
/**
 * Balrog class is a subclass of the Demon class, which extends from the Creature
 * class. This class calculates the Balrog's hp, strength, and magic chance. 
 *
 * @author Emily Lubonty
 * @version 4-9-2025
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80; 
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    
    private static final int MAX_BALROG_MAGIC = 100;
    private static final int MIN_BALROG_MAGIC = 1; 
    

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR) + MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP) + MIN_BALROG_HP,
            Randomizer.nextInt(MAX_BALROG_MAGIC-MIN_BALROG_MAGIC) + MIN_BALROG_MAGIC
        );
    }

    /**
     * Calculates damage done by Balrog. 
     * 
     * @param attack Increments the amount of times Balrog can attack
     * @return Returns the amount of times Balrog has attacked.
     */
    public int balrog_attack(int attack){
        attack++;
        return attack; 
    }
}
