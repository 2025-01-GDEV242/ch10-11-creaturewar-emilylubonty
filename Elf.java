
/**
 * The Elf class extends from the Creature class. It calculates the elf's hp, 
 * strength, and magic chances. 
 *
 * @author Emily Lubonty
 * @version 4-9-2025
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8; 
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5; 
    
    private static final int MAX_ELF_MAGIC = 100;
    private static final int MIN_ELF_MAGIC = 1; 
    

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR) + MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP) + MIN_ELF_HP, 
            Randomizer.nextInt(MAX_ELF_MAGIC-MIN_ELF_MAGIC) + MIN_ELF_MAGIC
        );
        
    }

    /**
     * Calculates damage done by elf if magic chance is enacted. 
     *
     * @return damage Damage taken if elf magic is implemented. 
     */
    public int elf_damage(int damage)
    {
        // put your code here
        Randomizer.nextInt(MAX_ELF_MAGIC); 
        
        if (MAX_ELF_MAGIC > 10){
            damage = damage;   
        }
        else{
            damage = damage * 2;  
        }
        
        return damage; 
    }
}
