import java.util.ArrayList;
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
    private double magic_chance = 5; 
    private double magic_dmg = 50;
    
    private int demon_hp;
    private int demon_str; 
    
    private static final int MAX_DEMON_MAGIC = 100;
    private static final int MIN_DEMON_MAGIC = 1; 
    
    private ArrayList<Demon> armyTwo;     
    /**
     * Constructor for objects of class Demon
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

    
    
