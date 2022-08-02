
public class Application {

	public static void main(String[] args) {
		
		//Testing to make sure all methods of the Wizard class are working properly
		
		//creating a wizard that represents base settings (empty-argument constructor)
		Wizard a = new Wizard();
		//printing out test wizard
		System.out.println(a);
		//creating a wizard that has a name
		Wizard b = new Wizard("Gandalf");
		//printing wizard with name
		System.out.println(b);
		//calling takeDamage method to take away health from wizard b
		b.takeDamage(45);
		//printing out the damage done to wizard b's health
		System.out.println(b);
		//giving wizard b an identification key
		b.setKey(40);
		//printing the key assigned to the wizard
		System.out.println(b);
		//setting wizard b's locked to true; should no longer take damage
		b.locked = true;
		//printing the change in lock
		System.out.println(b);
		//calling takeDamage method on wizard b again; should not affect wizard b's health
		b.takeDamage(30);
		//printing the health of our wizard; still the same as it was previously; did not take damage this time as locked is now set to true
		System.out.println(b);
		//testing the setKey method; should not chance wizard b's key as the key for this wizard has already been set
		b.setKey(20);
		//printing out wizard b; showing no change
		System.out.println(b);
		//calling unlock method to change wizard b's key back to unlocked; should work because the key passed in here should match wizard b's key
		b.unlock(40);
		//printing the change in lock
		System.out.println(b);
		//calling lock method to change wizard b's key back to locked; should work because the key passed in here should match wizard b's key
		b.lock(40);
		//printing the change in lock
		System.out.println(b);
		
		
		
	

	}
}
//end class
