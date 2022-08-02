/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		setName("");
		setHealth(100);
		setKey(0);
		this.locked = false;
	}//end constructor
	

	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		setName(name);
		setHealth(100);
		setKey(0);
		this.locked = false;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(locked == false)
		{
			setHealth(health-power);
		}
	}
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	//toString method

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	
	//Setter to be used for the key is key has not already been set
	@Override
	public void setKey(int key) {
		if (key>0 && this.key ==0) {
			this.key = key;
		}
		
	}
	
	//lock method sets locked to true if keys match
	@Override
	public void lock(int key) {
		if(key == getKey()) {
			this.locked = true;
		}
	}
	
	//unlock method sets locked to false if keys match

	@Override
	public void unlock(int key) {
		if(key == getKey()) {
			this.locked = false;
		}
		
	}
	
	//returns the value of locked

	@Override
	public boolean isLocked() {
		return locked;
	}
	



	
}//end class
