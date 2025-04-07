
/**
 * Class Demon 
 * 
 * Main class for demons. 
 *
 * @author Emily Lubonty
 * @version 4-7-2025
 */
public class Demon
{
    // instance variables - replace the example below with your own
    private int str;
    private int max_hp; 
    private int hp; 

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        // initialise instance variables
        this.str = str;
        this.hp = hp; 
        max_hp = hp; 
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        // TODO: implement a damage method
        
        return 0;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        // TODO: implement a method to report if the creature yet lives
        
        return false; //change this
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        //TODO: implement a method to report if the creature has been killed
        return false; //change this
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        // TODO: implement this
    }

    
}
