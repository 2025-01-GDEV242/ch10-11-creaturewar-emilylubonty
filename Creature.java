import java.util.ArrayList; 
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Emily Lubonty
 * @version 4-9-2025
 */
public abstract class Creature 
{
    private  int str;        // The strength of this creature
    private  int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private  int hp;         // the current numberof hit points the creature has
    private int magic; 
    
    private ArrayList<Creature> armyOne;
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp, int magic) {
       this.str = str;
       this.hp = hp;
       this.magic = magic;
       max_hp = hp;
    }
    
    /**
     * Adds Creatures to their designated armies
     * 
     * @param human Creates a new human to be added to the army. 
     */
    public void addArmy(){
        ArrayList<Creature> armyOne = new ArrayList<Creature>(); 
        
        Creature human = new Human();
   
        int i = Randomizer.nextInt(100);
        
        for (i = 1; i < 100; i++){
            armyOne.add(human); 
        }
    
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        // TODO: implement a damage method
        Randomizer.nextInt(this.str - this.hp); 
        return this.str;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        if (this.hp <= 0){
            return false;
        }
        return true;
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        if (this.hp <= 0){
            return false;  
        }
        return true;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public int takeDamage(int damage) {
        this.hp = this.hp - damage; 
        return this.hp;
    }
    
}
