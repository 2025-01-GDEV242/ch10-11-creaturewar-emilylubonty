import java.util.ArrayList;
/**
 * Subclass of Creature class. Includes Demons such as Balrog and Cyberdemon. 
 * Calculates the demon's hp, strength, and magic chances. 
 *
 * @author Emily Lubonty
 * @version 4-9-2025
 */
public class Demon extends Creature 
{
    // instance variables - replace the example below with your own
    private double magic_chance = 5; 
    private double magic_dmg = 50;
    
    private int demon_hp;
    private int demon_str; 
    
    private static final int MAX_DEMON_MAGIC = 100;
    private static final int MIN_DEMON_MAGIC = 1; 
    
    private ArrayList<Demon> armyTwo;     
    /**
     * Constructor for objects of class Demon
     * 
     * @param demon_hp The demon's strength
     * @param demon_str The demon's hitpoints
     */
    public Demon (int str, int hp, int magic)
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(hp),
            Randomizer.nextInt(str),
            Randomizer.nextInt(magic)
        ); 
        
        this.demon_hp = str; 
        this.demon_str = hp; 
        
        
        
        
    }
    
    /**
     * Calculates demon's damage depending on magic chance
     * 
     * @param damage Calculates damage
     * @return Returns damage to superclass
     */
    public int demonDamage(int damage)
    {
        // put your code here
        Randomizer.nextInt(MAX_DEMON_MAGIC); 
        
        if (MAX_DEMON_MAGIC > 10){
            damage = demon_hp;   
        }
        else{
            damage = damage * 2;  
        }
        
        return damage; 
    }
    
    
    
}

    
    
